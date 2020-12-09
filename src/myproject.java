
public class myproject {
	public	static String Shortcuts [][] =

			{ { "File menu options in current program" , " Alt+F " },             

					{ "Open Edit options in current program"  ,  " Alt+E " }

					, { "Switch between open programs"  , " Alt+Tab " },
 
					{ "View help information (F1 is used by almost every Windows program to display help "  ,  " F1 " },

					{ " Rename a selected file "  ,  " F2 " }

					, { " Refresh the current program window "  ,  " F5 " },

					{ " Bookmarks the current page in most Internet browsers  "  , " Ctrl+D " },

					{ " Create a new or blank document in some software, or open a new tab in most Internet browsers  " ,  " Ctrl+N " }

					, { " Open a file in the current software "  ,  " Ctrl+O " }

					, { " Select all text "  ,  "Ctrl+A" },

					{ " Change selected text to be bold  "  ,  " Ctrl+B " }

					, { " Change selected text to be in italics " ,  " Ctrl+I " },

					{ "  Change selected text to be underlined "   ,  " Ctrl+U " },

					{ " Open find window for current document or window "  ,  " Ctrl+F " },

					{ " Save current document file "  ,  " Ctrl+S " } 
					,{" Cut selected item "   ,   " Ctrl+X "},
					
					{" Cut selected item. "   ,   " Shift+Del "},
					
					{" 	Copy selected item "   ,   " Ctrl+C "},
					
					{" Copy selected item "   ,   " Ctrl+Ins "},
					
					{" 	Paste "   ,   " Ctrl+V "},
					
					{" 	Paste "   ,   " Shift+Ins "},
					
					{" Redo last action "   ,   " Ctrl+Y "},
					
					{" Undo last action "   ,   " Ctrl+Z "},
					
					{" Insert hyperlink for selected text "   ,   " Ctrl+K "}
					
					,{" Print the current page or document "   ,   " Ctrl+P "}};

	public static String loop(String  Short) {
		for (String[] Shortcuts1 : Shortcuts)
		{
			if (Shortcuts1[1].equalsIgnoreCase(Short))
				return Shortcuts1[0];
			
		}
		return "not found";
	}

	public static void main(String[] args) {
		
			System.out.println(loop(" f5 "));
		

	}

}
