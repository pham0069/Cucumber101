package additem;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * PageObject contains all the info needed to use a particular web page, TODO app
 * ITEM_NAME_FIELD and ITEMS_LIST identify specific HTML elements on the page
 */
@DefaultUrl("https://todomvc.com/examples/angular/dist/browser/#/all")
public class TodoListPage extends PageObject {
    public static Target ITEM_NAME_FIELD = Target.the("item name field").locatedBy(".new-todo");

    public static Target ITEMS_LIST = Target.the(" item list").locatedBy(".todo-list li");
}
