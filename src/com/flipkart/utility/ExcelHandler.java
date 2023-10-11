package com.flipkart.utility;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.File;
import java.util.HashMap;

public class ExcelHandler {
	   private HashMap<String, Sheet> importedSheets = new HashMap<String, Sheet>();
	    private Sheet selectedSheet = null;

	    public ExcelHandler(File excelWorkbook) throws Exception {
	        Workbook workbook = Workbook.getWorkbook(excelWorkbook);
	        String[] sheetNames = workbook.getSheetNames();
	        Sheet[] sheetData = workbook.getSheets();
	        for (int sheetNumber = 0; sheetNumber < sheetData.length; sheetNumber++) {
	            this.importedSheets.put(sheetNames[sheetNumber], sheetData[sheetNumber]);
	        }
	    }

	    public void selectSheet(String sheetName) throws Exception {
	        if (this.importedSheets.containsKey(sheetName)) {
	            this.selectedSheet = importedSheets.get(sheetName);
	        } else {
	            throw new Exception("Sheet with name '" + sheetName + "' doesn't exist!");
	        }
	    }

	    public String selectedSheetName() throws Exception {
	        return this.selectedSheet.getName();
	    }

	    /**
	     * Get a specific column from the Excel Worksheet
	     * (The first column is column 1)
	     *
	     * @param columnNumber
	     * @return
	     * @throws Exception
	     */
	    public HashMap<Integer, Cell> getColumn(int columnNumber) throws Exception {
	        return getColumn(columnNumber, false);
	    }

	    /**
	     * Get a specific column from the Excel Worksheet
	     * You can optionally skip the top row of the column to ensure column titles are not pulled into the data set
	     * (The first column is column 1)
	     *
	     * @param columnNumber
	     * @param skipFirstRow
	     * @return
	     * @throws Exception
	     */
	    public HashMap<Integer, Cell> getColumn(int columnNumber, boolean skipFirstRow) throws Exception {
	        if (this.selectedSheet.equals(null)) {
	            throw new Exception("No sheet selected.  You must select a sheet before trying to get data!");
	        } else if (columnNumber > this.selectedSheet.getColumns()) {
	            throw new Exception("There are only " + this.selectedSheet.getColumns() + " columns in this sheet.  Unable to select column " + columnNumber + "!");
	        }
	        HashMap<Integer, Cell> selectedColumn = new HashMap<Integer, Cell>();
	        for (Cell currentCell : this.selectedSheet.getColumn(columnNumber - 1)) {
	            selectedColumn.put(selectedColumn.size() + 1, currentCell);
	        }
	        if (skipFirstRow) {
	            selectedColumn.remove(1);
	        }
	        return selectedColumn;
	    }

	    /**
	     * Get a specific row from the Excel Worksheet
	     * (The first row is row 1)
	     *
	     * @param rowNumber
	     * @return
	     * @throws Exception
	     */
	    public HashMap<Integer, Cell> getRow(int rowNumber) throws Exception {
	        return getRow(rowNumber, false);
	    }

	    /**
	     * Get a specific row from the Excel Worksheet
	     * You can optionally skip the first column of the row to ensure row titles are not pulled into the data set
	     * (The first row is row 1)
	     *
	     * @param rowNumber
	     * @param skipFirstColumn
	     * @return
	     * @throws Exception
	     */
	    public HashMap<Integer, Cell> getRow(int rowNumber, boolean skipFirstColumn) throws Exception {
	        if (this.selectedSheet.equals(null)) {
	            throw new Exception("No sheet selected.  You must select a sheet before trying to get data!");
	        } else if (rowNumber > this.selectedSheet.getRows()) {
	            throw new Exception("There are only " + this.selectedSheet.getRows() + " rows in this sheet.  Unable to select row " + rowNumber + "!");
	        }
	        HashMap<Integer, Cell> selectedRow = new HashMap<Integer, Cell>();
	        for (Cell currentCell : this.selectedSheet.getRow(rowNumber - 1)) {
	            selectedRow.put(selectedRow.size() + 1, currentCell);
	        }
	        if (skipFirstColumn) {
	            selectedRow.remove(1);
	        }
	        return selectedRow;
	    }

	}
	