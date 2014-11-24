package ru.netcracker;


public interface Array {
    public void add (int element);
    public Integer getByIndex(int index);
    public Integer min();
    public Integer max();
    public Integer find(int element);
    public void remove(int index);
    public void sort();
    public int len();
}
