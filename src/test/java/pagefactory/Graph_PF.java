package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class Graph_PF extends BaseClass {
	
	//These webElements are on the graph home page https://dsportalapp.herokuapp.com/graph/
		@FindBy(xpath="//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[7]/div/div/a[text()='Get Started']")
		WebElement btn_HomeGetStartedGraph;
		
		@FindBy(xpath="//div[@class='bs-example']/../div[2]/ul[2]/a[text()='Graph']")
		WebElement lnk_Graph1;
		
	////These webElements are on the graph home page https://dsportalapp.herokuapp.com/graph/graph/

		@FindBy(xpath="//div[@class='container']/div/div/div/li/a[text()='Graph']")
		WebElement lnk_GraphGraph;
		
		@FindBy(xpath="//p[text()='Graph']") WebElement txt_GraphGraphtitle;
		
		@FindBy(xpath="//div[@class='container']/div/div/div/li[2]/a[text()='Graph Representations']")
		WebElement lnk_GraphRepresentations;
		
		@FindBy(xpath="//p[text()='Graph Representations']") WebElement txt_GraphRepresentationtitle;
		
		@FindBy(xpath="//div[@class='container']/div/div/div/a[text()='Practice Questions']")
		WebElement lnk_PracticeQuestions;
		
		@FindBy(xpath="//a[text()=\"Try here>>>\"]")
		WebElement lnk_TryHere;
		
		@FindBy(xpath="//div[@class='CodeMirror-code']/div/pre[@class=' CodeMirror-line ']")
		WebElement txt_codeEditor;
		
		@FindBy(xpath="//button[@type='button']")
		WebElement btn_run;
		
		public Graph_PF(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		public void clickHomeGetStartedGraph() {
			btn_HomeGetStartedGraph.click();
		}
		public void clickGraph()
		{
			lnk_Graph1.click();
		}
		
		public void clickGraphRepresentations()
		{
			lnk_GraphRepresentations.click();
		}
		
		public void clickPracticeQuestion()
		{
			lnk_PracticeQuestions.click();
		}
		
		public void clickGraphTryHere()
		{
			lnk_TryHere.click();
		}
		
		public void blankEditor()
		{
			txt_codeEditor.sendKeys("");
		}
		
		public void enterValidCode()
		{
			txt_codeEditor.sendKeys("code from excel");
		}
		
		public void enterInvalidCode()
		{
			txt_codeEditor.sendKeys("invalid code from excel");
		}
		
		public void clickGraphRun()
		{
			btn_run.click();
		}
		 public boolean isPageHavingEditorAndRunButton() {
			 if(txt_codeEditor.isDisplayed() && btn_run.isDisplayed())
			 {
				 return true;
			 }
			 else
				 return false;
		 }
		
		 public String getGraphGraphtitle() {
				String msg=txt_GraphGraphtitle.getText();
				System.out.println("The user able to see Title: "+msg);
				return msg;
			}
		 
		 public String getGraphRepresentationtitle() {
				String msg=txt_GraphRepresentationtitle.getText();
				System.out.println("The user able to see Title: "+msg);
				return msg;
			}
		 
		
}
