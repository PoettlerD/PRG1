package org.campus02.VierGewinnt;

public class VierGewinnt {

	private int sizeX;
	private int sizeY;
	private char[][] charArray;
	
	public VierGewinnt (int sizeX, int sizeY)
	{
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		charArray = new char [sizeX] [sizeY];
		for (int x = 0; x < sizeX; x++)
		{
			for (int y = 0; y < sizeY; y++)
			{
				charArray[x][y]= ' ';
			}
		}
		
	}

	public int getSizeX() {
		return sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public boolean playerA(int x, int y)
	{
		x = x-1;
		y = y-1;
		if (charArray[y][x] == ' ')
		{charArray[y][x] = 'A';
		return true;}
		else
		{
			return false;
		}
	}
		public boolean playerB(int x, int y)
		{
			x = x-1;
			y = y-1;
			if (charArray[y][x] == ' ')
			{charArray[y][x] = 'B';
			return true;}
			else
			{
				return false;
			}
		}
			
		private char fourInRow()
			{
				
				for (int x = 0; x < sizeX; x++)
				{
					int countA = 0;
					int countB = 0;
					for (int y = 0; y< sizeY; y++)
					{
						
						if (charArray[x][y] == 'A')
						{
							countA++;
						}
						else if (charArray[x][y] == 'B')
						{
							countB++;
						}
					if (countA == 4)
					{
						return 'A';
					}
					else if (countB == 4)
					{
						return 'B';
					}
					}
				
				
				}
				return '-';
			}
		
		
		private char fourInColumn()
		{
			
			for (int y = 0; y < sizeX; y++)
			{
				int countA = 0;
				int countB = 0;
				for (int x = 0; x< sizeY; x++)
				{
					
					if (charArray[x][y] == 'A')
					{
						countA++;
					}
					else if (charArray[x][y] == 'B')
					{
						countB++;
					}
				if (countA == 4)
				{
					return 'A';
				}
				else if (countB == 4)
				{
					return 'B';
				}
				}
			
			
			}
			return '-';
		}
		
		
		public char winner()
		{
			char winner = fourInRow();
			if (winner != ' ')
			{
				return winner;
			}
		winner = fourInColumn();
		{
			if (winner != ' ')
					{
							return winner;
					}
		}
		return '-';
		}



public void print()
{
	for (int x = 0; x < sizeX; x++)
	{
		for (int y = 0; y < sizeY; y++)
		{
			System.out.print(charArray[x][y]);
		}
	System.out.println();
	}
}

}
		
	
	

	

	
	
	

