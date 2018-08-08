package com.m3c.dh.sortController;

import com.m3c.dh.sortManager.BubbleSort;
import com.m3c.dh.sortManager.MergeSort;
import com.m3c.dh.sortManager.Sorter;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class SortFactory
{
    Properties properties = new Properties();

    public Sorter getInstance() throws FactoryException
    {
        try {

            properties.load(new FileReader("Resources/factory.properties"));
            String sorter = properties.getProperty("sorter");

            Class selectedSorter = Class.forName(sorter);

            return (Sorter) selectedSorter.getConstructor().newInstance();
        } catch (IOException e) {
            throw new FactoryException("Problem reading the file");
        }
        catch (ClassNotFoundException e) {
            throw new FactoryException("could not find chosen sorter");
        }
        catch (InstantiationException e){
            throw new FactoryException("couldnt create sorter");
        }
        catch (IllegalAccessException e) {
            throw new FactoryException("cant read file");
        }
        catch (NoSuchMethodException e) {
            throw new FactoryException("could not find sorter");
        }
        catch (InvocationTargetException e) {
            throw  new FactoryException("new instance threw exception");
        }
    }
}
