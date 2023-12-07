package pagefactory;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tree_PF {
	
	//@FindBy(linkText = "Data Structures")
//	WebElement lnk_dropdown;
	
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
	WebElement lnk_dropdown;

	@FindBy(xpath="//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[6]/div/div/a[text()='Get Started']")
	WebElement lnk_HomeGetStartedTree;
	
	@FindBy(xpath="/html/body/div[2]/h4") WebElement txt_Treetitle;
	
	@FindBy(linkText = "Overview of Trees")
	WebElement lnk_Overview_of_Trees;
	
	 @FindBy(xpath="//p[text()='Overview of Trees']")WebElement txt_OverviewOfTreetitle;
	
	@FindBy(linkText = "Terminologies")
	WebElement lnk_Terminologies;
	
	@FindBy(xpath="//p[text()='Terminologies']")WebElement txt_TerminologiesTreetitle;
	
	@FindBy(linkText = "Types of Trees")
	WebElement lnk_Types_of_Trees;
	
	@FindBy(xpath="//p[text()='Types of Trees']")WebElement txt_TypesofTreetitle;
	
	@FindBy(xpath="//a[contains(@href,'/tree/tree-traversals/')]")
	WebElement lnk_Tree_Traversals;
	
	@FindBy(xpath="//p[text()='Tree Traversals']")WebElement txt_TreeTraversalsTreetitle;
	
	@FindBy(linkText = "Traversals-Illustration")
	WebElement lnk_Traversals_Illustration;
	
	@FindBy(xpath="//p[text()='Traversals-Illustration']")WebElement txt_TraversalsIllustrationTreetitle;
	
	@FindBy(xpath="//div[@id='content']/li[6]/a[text()='Binary Trees']")
	WebElement lnk_Binary_Trees;
	
	@FindBy(xpath="//p[text()='Binary Trees']")WebElement txt_BinaryTreetitle;
	
	@FindBy(xpath="//div[@id='content']/li[7]/a[text()='Types of Binary Trees']")
	WebElement lnk_Types_of_Binary_Trees;
	
	@FindBy(xpath="//p[text()='Types of Binary Trees']")WebElement txt_TypesofBinaryTreetitle;
	
	@FindBy(linkText = "Implementation in Python")
	WebElement lnk_Implementation_in_Python;
	
	@FindBy(xpath="//p[text()='Implementation in Python']")WebElement txt_ImplementationinPythonTreetitle;
	
	@FindBy(linkText = "Binary Tree Traversals")
	WebElement lnk_Binary_Tree_Traversals;
	
	@FindBy(xpath="//p[text()='Binary Tree Traversals']")WebElement txt_BinaryTreeTraversalsTreetitle;
	
	@FindBy(linkText = "Implementation of Binary Trees")
	WebElement lnk_Implementation_of_Binary_Trees;
	
	@FindBy(xpath="//p[text()='Implementation of Binary Trees']")WebElement txt_ImplementationofBinaryTreetitle;
	
	@FindBy(linkText = "Applications of Binary trees")
	WebElement lnk_Applications_of_Binary_trees;
	
	@FindBy(xpath="//p[text()='Applications of Binary trees']")WebElement txt_ApplicationsofBinaryTreetitle;
	
	@FindBy(linkText = "Binary Search Trees")
	WebElement lnk_Binary_Search_Trees;
	
	@FindBy(xpath="//p[text()='Binary Search Trees']")WebElement txt_BinarySearchTreetitle;
	
	@FindBy(linkText = "Implementation Of BST")
	WebElement lnk_Implementation_Of_BST;
	
	@FindBy(xpath="//p[text()='Implementation Of BST']")WebElement txt_ImplementationOfBSTTreetitle;
	
	@FindBy(linkText = "Practice Questions")
	WebElement lnk_Practice_Questions;
	
	@FindBy(linkText = "Try here>>>")
	WebElement lnk_Try_here;
	
	@FindBy(xpath="//div[@class='CodeMirror-code']/div/pre[@class=' CodeMirror-line ']")
	WebElement txt_codeEditor;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement btn_run;
	
	public Tree_PF(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickHomeGetStartedTree()
	{
		lnk_HomeGetStartedTree.click();
	}
	
	public void clickOverviewofTrees()
	{
		lnk_Overview_of_Trees.click();
	}
	
	public void clickTerminologies()
	{
		lnk_Terminologies.click();
	}
	
	public void clickTypesofTrees()
	{
		lnk_Types_of_Trees.click();
	}
	
	public void clickTreeTraversals()
	{
		lnk_Tree_Traversals.click();
	}
	
	public void clickTraversalsIllustration()
	{
		lnk_Traversals_Illustration.click();
	}
	
	public void clickBinaryTrees()
	{
		lnk_Binary_Trees.click();
	}
	
	public void clickTypesofBinaryTrees()
	{
		lnk_Types_of_Binary_Trees.click();
	}
	
	public void clickImplementationInPython()
	{
		lnk_Implementation_in_Python.click();
	}
	
	public void clickBinaryTreeTraversals()
	{
		lnk_Binary_Tree_Traversals.click();
	}
	
	public void clickImplementationOfBinaryTrees()
	{
		lnk_Implementation_of_Binary_Trees.click();
	}
	
	public void clickApplicationsOfBinaryTrees()
	{
		lnk_Applications_of_Binary_trees.click();
	}
	
	public void clickBinarySearchTrees()
	{
		lnk_Binary_Search_Trees.click();
	}
	
	public void clickImplementationOfBST()
	{
		lnk_Implementation_Of_BST.click();
	}
	
	public void clickPracticeQuestion()
	{
		lnk_Practice_Questions.click();
	}
	
	public void clickTreeTryHere()
	{
		lnk_Try_here.click();
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
	
	public void clickTreeRun()
	{
		btn_run.click();
	}
	
	public String getTreeTitle() {
		String msg=txt_Treetitle.getText();
		System.out.println("The user able to see Title: "+msg);
		return msg;
	}
	
	public String getOverviewOfTreetitle() {
		String msg=txt_OverviewOfTreetitle.getText();
		System.out.println("The user able to see Title: "+msg);
		return msg;
	}

	public String getTerminologiesTreetitle() {
		String msg=txt_TerminologiesTreetitle.getText();
		System.out.println("The user able to see Title: "+msg);
		return msg;
	}
	
	public String getTypesofTreetitle() {
		String msg=txt_TypesofTreetitle.getText();
		System.out.println("The user able to see Title: "+msg);
		return msg;
	}
	
	public String getTreeTraversalsTreetitle() {
		String msg=txt_TreeTraversalsTreetitle.getText();
		System.out.println("The user able to see Title: "+msg);
		return msg;
	}
	
	public String getTraversalsIllustrationTreetitle() {
		String msg=txt_TraversalsIllustrationTreetitle.getText();
		System.out.println("The user able to see Title: "+msg);
		return msg;
	}
	
	public String getBinaryTreetitle() {
		String msg=txt_BinaryTreetitle.getText();
		System.out.println("The user able to see Title: "+msg);
		return msg;
	}
	
	public String getTypesofBinaryTreetitle() {
		String msg=txt_TypesofBinaryTreetitle.getText();
		System.out.println("The user able to see Title: "+msg);
		return msg;
	}
	
	public String getImplementationinPythonTreetitle() {
		String msg=txt_ImplementationinPythonTreetitle.getText();
		System.out.println("The user able to see Title: "+msg);
		return msg;
	}
	
	public String getBinaryTreeTraversalsTreetitle() {
		String msg=txt_BinaryTreeTraversalsTreetitle.getText();
		System.out.println("The user able to see Title: "+msg);
		return msg;
	}
	
	public String getImplementationofBinaryTreetitle() {
		String msg=txt_ImplementationofBinaryTreetitle.getText();
		System.out.println("The user able to see Title: "+msg);
		return msg;
	}
	
	public String getApplicationsofBinaryTreetitle() {
		String msg=txt_ApplicationsofBinaryTreetitle.getText();
		System.out.println("The user able to see Title: "+msg);
		return msg;
	}
	
	public String getBinarySearchTreetitle() {
		String msg=txt_BinarySearchTreetitle.getText();
		System.out.println("The user able to see Title: "+msg);
		return msg;
	}
	
	public String getImplementationOfBSTTreetitle() {
		String msg=txt_ImplementationOfBSTTreetitle.getText();
		System.out.println("The user able to see Title: "+msg);
		return msg;
	}
	
	public byte[] screenshot(WebDriver driver) {
	    return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
	
}
