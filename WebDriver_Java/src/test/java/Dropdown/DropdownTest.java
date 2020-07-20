package Dropdown;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTest
{
    @Test
    public void selectDropDownoption(){
        String option = "Option 1";
       DropDownPage dropdownpage= homepage.ClickDropdown();
       dropdownpage.selectFromDropdown( option);

       assertEquals(dropdownpage.getSelectedOptions().size(), 1, "Incorrect selection");
       assertTrue(dropdownpage.getSelectedOptions().contains( option ), "Option not Selected");

    }
}
