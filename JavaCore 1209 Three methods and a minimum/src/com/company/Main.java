package com.company;

/*

1209 Three methods and a minimum
Write public static methods: int min (int, int), long min (long, long), double min (double, double).
Each method should return the minimum of two numbers passed to it.
Requirements:
1. The program should not display text on the screen.
2. The Solution class must contain four methods.
3. The Solution class must contain the static method int min (int, int).
4. The int min (int, int) method should return the minimum of two numbers of type int.
5. The Solution class must contain the static method long min (long, long).
6. The long min (long, long) method should return the minimum of two long numbers.
7. The Solution class must contain the static method double min (double, double).
8. The double min (double, double) method should return the minimum of two double numbers.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
    }
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
    public static long min(long a, long b) {
        return a < b ? a : b;
    }
    public static double min(double a, double b) {
        return a < b ? a : b;
    }
}

