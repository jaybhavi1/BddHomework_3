package com.letskodeit;

/**
 * @author Jay Vaghani on 06/05/2017.
 */
public class Rough
{




        static int num = 1111;
        static {
            num = num-- - --num;
            System.out.println(num);
        }

        {
            num = num++ + ++num;

        }

        public static void main(String[] args) {

            System.out.println(num);

        }

    }

