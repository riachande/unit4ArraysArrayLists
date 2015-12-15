// Implements a 2-D array of characters

public class CharMatrix
{
  // Instance variables:
private char [][] grid; 
  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {

  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
  public CharMatrix(int rows, int cols, char fill)
  {
    this.grid = new char[rows][cols];
    
    for(int i = 0; i<this.grid.length; i++)
    {
        for (int j = 0 ; j<this.grid[i].length;j++)
        {
            this.grid[i][j] =' ' ;
  }
}
}

  // Returns the number of rows in grid
  public int numRows()
  {
    int rows = 0; 
    for( i = 0; i< this.grid.length ; i++)
    {
        rows += 1 ; 
    
  }
  return rows 
}
  

  // Returns the number of columns in grid
  public int numCols()
  {int cols = 0 ; 
     for (j = 0; i<this.grid.length; j++)
     {
         cols += 1; 
         
  }
  return cols; 
}
  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
   char location = this.grid[row][col]; 
   return location; 
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
        this.grid = new char[rows][col];
   
 
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
   if (this.grid[row][col] = ' ')
   {
       return true;  
    } 
    else
    {
        return false; 
   
  }
}


  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
  for ( i = 0;i <row0; i++)
  {
      for( j = 0; j <col
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
   
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
   
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
   
  }
}
