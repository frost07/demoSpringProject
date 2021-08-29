package xml;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import models.Entity;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class DOMxmlWriter {

    public static void mainXML(Entity entity) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();

            // создаем пустой объект Document, в котором будем
            // создавать наш xml-файл
            Document doc = builder.newDocument();
            // создаем корневой элемент
            Element rootElement =
                    doc.createElementNS("", "Baloons");
            // добавляем корневой элемент в объект Document
            doc.appendChild(rootElement);

            // добавляем первый дочерний элемент к корневому
            rootElement.appendChild(getFilling(doc, entity.getFb50(), entity.getFb50m(), entity.getFb27(), entity.getFb12(), entity.getFb5()));

            //добавляем второй дочерний элемент к корневому
            rootElement.appendChild(getRealization(doc, entity.getRb50(), entity.getRb50m(), entity.getRb27(), entity.getRb12(), entity.getRb5()));

            //создаем объект TransformerFactory для печати в консоль
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            // для красивого вывода в консоль
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);

            //печатаем в консоль или файл
            StreamResult console = new StreamResult(System.out);
//            StreamResult file = new StreamResult(new File("/languages.xml"));

            //записываем данные
            transformer.transform(source, console);
//            transformer.transform(source, file);
//            System.out.println("Создание XML файла закончено");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // метод для создания нового узла XML-файла
    private static Node getFilling(Document doc, String b50, String b50m, String b27, String b12, String b5) {
        Element filling = doc.createElement("Filling");

        // устанавливаем атрибут id
//        language.setAttribute("id", id);

        // создаем элементы b50, b50m, b27, b12, b5
        filling.appendChild(getLanguageElements(doc, filling, "b50", b50));
        filling.appendChild(getLanguageElements(doc, filling, "b50m", b50m));
        filling.appendChild(getLanguageElements(doc, filling, "b27", b27));
        filling.appendChild(getLanguageElements(doc, filling, "b12", b12));
        filling.appendChild(getLanguageElements(doc, filling, "b5", b5));
        return filling;
    }

    // метод для создания нового узла XML-файла
    private static Node getRealization(Document doc, String b50, String b50m, String b27, String b12, String b5) {
        Element realization = doc.createElement("Realization");

        // устанавливаем атрибут id
//        language.setAttribute("id", id);

        // создаем элементы b50, b50m, b27, b12, b5
        realization.appendChild(getLanguageElements(doc, realization, "b50", b50));
        realization.appendChild(getLanguageElements(doc, realization, "b50m", b50m));
        realization.appendChild(getLanguageElements(doc, realization, "b27", b27));
        realization.appendChild(getLanguageElements(doc, realization, "b12", b12));
        realization.appendChild(getLanguageElements(doc, realization, "b5", b5));
        return realization;
    }


    // утилитный метод для создание нового узла XML-файла
    private static Node getLanguageElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }

}