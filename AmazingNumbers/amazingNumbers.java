package AmazingNumbers;

import java.text.NumberFormat;
import java.util.*;

public class AmazingNumbers {
    public static void main(String[] args) {
        printContents();
    }

    public static void printContents() {
        NumberFormat format = NumberFormat.getInstance();
        long input1 = 0;
        long input2 = 0;
        String property = "";
        String property1 = "";
        String property2 = "";
        String property3 = "";
        String property4 = "";
        String property5 = "";
        String property6 = "";
        String property7 = "";
        String property8 = "";
        String property9 = "";
        supportedRequests();
        long input = 1;

        while (input != 0) {
            try {
                String[] inputArr = getInput();
                input = Long.parseLong(inputArr[0]);
                if (inputArr.length == 12) {
                    ArrayList<String> inputValuesList = new ArrayList<>();
                    input1 = Long.parseLong(inputArr[0]);
                    input2 = Long.parseLong(inputArr[1]);
                    property = inputArr[2];
                    property1 = inputArr[3];
                    property2 = inputArr[4];
                    property3 = inputArr[5];
                    property4 = inputArr[6];
                    property5 = inputArr[7];
                    property6 = inputArr[8];
                    property7 = inputArr[9];
                    property8 = inputArr[10];
                    property9 = inputArr[11];

                    inputValuesList.add(property);
                    inputValuesList.add(property1);
                    inputValuesList.add(property2);
                    inputValuesList.add(property3);
                    inputValuesList.add(property4);
                    inputValuesList.add(property5);
                    inputValuesList.add(property6);
                    inputValuesList.add(property7);
                    inputValuesList.add(property8);
                    inputValuesList.add(property9);

                    if (mutuallyExclusive(inputValuesList)) {
                        if (input1 < 0) {
                            System.out.println("first parameter should be a natural number");
                        } else if (input2 < 0) {
                            System.out.println("The second parameter should be a natural number.");
                        }
                        if (availableProperties().containsAll(inputValuesList)) {

                            formatAll(input1, input2, inputValuesList);
                        } else {
                            System.out.println("The property ... is wrong");
                        }
                    } else {
                        System.out.println("The property ... is wrong");
                        System.out.println("Available properties " + printAvailableProperties() + "");
                    }
                } else if (inputArr.length == 11) {
                    ArrayList<String> inputValuesList = new ArrayList<>();
                    input1 = Long.parseLong(inputArr[0]);
                    input2 = Long.parseLong(inputArr[1]);
                    property = inputArr[2];
                    property1 = inputArr[3];
                    property2 = inputArr[4];
                    property3 = inputArr[5];
                    property4 = inputArr[6];
                    property5 = inputArr[7];
                    property6 = inputArr[8];
                    property7 = inputArr[9];
                    property8 = inputArr[10];
                    inputValuesList.add(property);
                    inputValuesList.add(property1);
                    inputValuesList.add(property2);
                    inputValuesList.add(property3);
                    inputValuesList.add(property4);
                    inputValuesList.add(property5);
                    inputValuesList.add(property6);
                    inputValuesList.add(property7);
                    inputValuesList.add(property8);
                    if (mutuallyExclusive(inputValuesList)) {
                        if (input1 < 0) {
                            System.out.println("first parameter should be a natural number");
                        } else if (input2 < 0) {
                            System.out.println("The second parameter should be a natural number.");
                        }
                        if (availableProperties().containsAll(inputValuesList)) {

                            formatAll(input1, input2, inputValuesList);
                        } else {
                            System.out.println("The property ... is wrong");
                        }
                    } else {
                        System.out.println("The property ... is wrong");
                        System.out.println("Available properties " + printAvailableProperties() + "");
                    }
                } else if (inputArr.length == 10) {
                    ArrayList<String> inputValuesList = new ArrayList<>();
                    input1 = Long.parseLong(inputArr[0]);
                    input2 = Long.parseLong(inputArr[1]);
                    property = inputArr[2];
                    property1 = inputArr[3];
                    property2 = inputArr[4];
                    property3 = inputArr[5];
                    property4 = inputArr[6];
                    property5 = inputArr[7];
                    property6 = inputArr[8];
                    property7 = inputArr[9];
                    inputValuesList.add(property);
                    inputValuesList.add(property1);
                    inputValuesList.add(property2);
                    inputValuesList.add(property3);
                    inputValuesList.add(property4);
                    inputValuesList.add(property5);
                    inputValuesList.add(property6);
                    inputValuesList.add(property7);
                    if (mutuallyExclusive(inputValuesList)) {
                        if (input1 < 0) {
                            System.out.println("first parameter should be a natural number");
                        } else if (input2 < 0) {
                            System.out.println("The second parameter should be a natural number.");
                        }
                        if (availableProperties().containsAll(inputValuesList)) {
                            formatAll(input1, input2, inputValuesList);
                        } else {
                            System.out.println("The property ... is wrong");
                        }
                    }else {
                        System.out.println("The property ... is wrong");
                        System.out.println("Available properties " + printAvailableProperties() + "");
                    }
                } else if (inputArr.length == 9) {
                    ArrayList<String> inputValuesList = new ArrayList<>();
                    input1 = Long.parseLong(inputArr[0]);
                    input2 = Long.parseLong(inputArr[1]);
                    property = inputArr[2];
                    property1 = inputArr[3];
                    property2 = inputArr[4];
                    property3 = inputArr[5];
                    property4 = inputArr[6];
                    property5 = inputArr[7];
                    property6 = inputArr[8];
                    inputValuesList.add(property);
                    inputValuesList.add(property1);
                    inputValuesList.add(property2);
                    inputValuesList.add(property3);
                    inputValuesList.add(property4);
                    inputValuesList.add(property5);
                    inputValuesList.add(property6);
                    if (mutuallyExclusive(inputValuesList)) {
                        if (input1 < 0) {
                            System.out.println("first parameter should be a natural number");
                        } else if (input2 < 0) {
                            System.out.println("The second parameter should be a natural number.");
                        }
                        if (availableProperties().containsAll(inputValuesList)) {
                            formatAll(input1, input2, inputValuesList);
                        } else {
                            System.out.println("The property ... is wrong");
                        }
                    } else {
                        System.out.println("The property ... is wrong");
                        System.out.println("Available properties " + printAvailableProperties() + "");
                    }
                } else if (inputArr.length == 8) {
                    ArrayList<String> inputValuesList = new ArrayList<>();
                    input1 = Long.parseLong(inputArr[0]);
                    input2 = Long.parseLong(inputArr[1]);
                    property = inputArr[2];
                    property1 = inputArr[3];
                    property2 = inputArr[4];
                    property3 = inputArr[5];
                    property4 = inputArr[6];
                    property5 = inputArr[7];
                    inputValuesList.add(property);
                    inputValuesList.add(property1);
                    inputValuesList.add(property2);
                    inputValuesList.add(property3);
                    inputValuesList.add(property4);
                    inputValuesList.add(property5);
                    if (mutuallyExclusive(inputValuesList)) {
                        if (input1 < 0) {
                            System.out.println("first parameter should be a natural number");
                        } else if (input2 < 0) {
                            System.out.println("The second parameter should be a natural number.");
                        }
                        if (availableProperties().containsAll(inputValuesList)) {
                            formatAll(input1, input2, inputValuesList);
                        } else {
                            System.out.println("The property ... is wrong");
                            System.out.println("Available properties " + printAvailableProperties() + "");

                        }
                    } else {
                        System.out.println("The property ... is wrong");
                        System.out.println("Available properties " + printAvailableProperties() + "");
                    }
                } else if (inputArr.length == 7) {
                    ArrayList<String> inputValuesList = new ArrayList<>();

                    input1 = Long.parseLong(inputArr[0]);
                    input2 = Long.parseLong(inputArr[1]);
                    property = inputArr[2];
                    property1 = inputArr[3];
                    property2 = inputArr[4];
                    property3 = inputArr[5];
                    property4 = inputArr[6];
                    inputValuesList.add(property);
                    inputValuesList.add(property1);
                    inputValuesList.add(property2);
                    inputValuesList.add(property3);
                    inputValuesList.add(property4);
                    if (mutuallyExclusive(inputValuesList)) {
                        if (input1 < 0) {
                            System.out.println("first parameter should be a natural number");
                        } else if (input2 < 0) {
                            System.out.println("The second parameter should be a natural number.");
                        }
                        if (availableProperties().containsAll(new HashSet<>(inputValuesList))) {
                            formatAll(input1, input2, inputValuesList);
                        }  else {
                            System.out.println("The property ... is wrong");
                            System.out.println("Available properties " + printAvailableProperties() + "");

                        }
                    }else{
                        System.out.println("The property ... is wrong");
                        System.out.println("Available properties " + printAvailableProperties() + "");
                    }
                } else if (inputArr.length == 6) {
                    ArrayList<String> inputValuesList = new ArrayList<>();

                    input1 = Long.parseLong(inputArr[0]);
                    input2 = Long.parseLong(inputArr[1]);
                    property = inputArr[2];
                    property1 = inputArr[3];
                    property2 = inputArr[4];
                    property3 = inputArr[5];
                    inputValuesList.add(property);
                    inputValuesList.add(property1);
                    inputValuesList.add(property2);
                    inputValuesList.add(property3);
                    if (mutuallyExclusive(inputValuesList)) {
                        if (input1 < 0) {
                            System.out.println("first parameter should be a natural number");
                        } else if (input2 < 0) {
                            System.out.println("The second parameter should be a natural number.");
                        }
                        if (availableProperties().containsAll(inputValuesList)) {
                            formatAll(input1, input2, inputValuesList);
                        } else {
                            System.out.println("The property ... is wrong");
                            System.out.println("Available properties " + printAvailableProperties() + "");

                        }
                    } else {
                        System.out.println("The property ... is wrong");
                        System.out.println("Available properties " + printAvailableProperties() + "");
                    }

                } else if (inputArr.length == 5) {
                    ArrayList<String> inputValuesList = new ArrayList<>();
                    input1 = Long.parseLong(inputArr[0]);
                    input2 = Long.parseLong(inputArr[1]);
                    property = inputArr[2];
                    property1 = inputArr[3];
                    property2 = inputArr[4];
                    inputValuesList.add(property);
                    inputValuesList.add(property1);
                    inputValuesList.add(property2);
                    if (mutuallyExclusive(inputValuesList)) {
                        if (input1 < 0) {
                            System.out.println("first paremeter should be a natural number");
                        } else if (input2 < 0) {
                            System.out.println("The second parameter should be a natural number.");
                        }
                        if (availableProperties().containsAll(inputValuesList)) {
                            formatAll(input1, input2, inputValuesList);
                        } else {
                            System.out.println("The property ... is wrong");
                            System.out.println("Available properties " + printAvailableProperties() + "");
                        }
                    } else {
                        System.out.println("The property ... is wrong");
                        System.out.println("Available properties " + printAvailableProperties() + "");
                    }
                } else if (inputArr.length == 4) {
                    ArrayList<String> inputValuesList = new ArrayList<>();
                    input1 = Long.parseLong(inputArr[0]);
                    input2 = Long.parseLong(inputArr[1]);
                    property = inputArr[2];
                    property1 = inputArr[3];
                    inputValuesList.add(property);
                    inputValuesList.add(property1);

                    if (mutuallyExclusive(inputValuesList)) {
                        if (input1 < 0) {
                            System.out.println("first parameter should be a natural number");
                        } else if (input2 < 0) {
                            System.out.println("The second parameter should be a natural number.");
                        }
                        if (availableProperties().containsAll(inputValuesList)) {
                            formatAll(input1, input2, inputValuesList);
                        } else {
                            if (!availableProperties().contains(property) && availableProperties().contains(property1)) {
                                System.out.println("The property [" + property.toUpperCase() + "] is wrong.");
                                System.out.println("Available properties " + printAvailableProperties() + "");
                            } else if (availableProperties().contains(property) && !availableProperties().contains(property1)) {
                                System.out.println("The property [" + property1.toUpperCase() + "] is wrong.");
                                System.out.println("Available properties " + printAvailableProperties() + "");
                            } else {
                                System.out.println("The properties ... are wrong");
                                System.out.println("Available properties " + printAvailableProperties() + "");
                            }
                        }
                    }
                } else if (inputArr.length == 3) {
                    ArrayList<String> inputValuesList = new ArrayList<>();
                    input1 = Long.parseLong(inputArr[0]);
                    input2 = Long.parseLong(inputArr[1]);
                    property = inputArr[2];
                    inputValuesList.add(property);

                    if (input1 < 0) {
                        System.out.println("first paremeter should be a natural number");
                    } else if (input2 < 0) {
                        System.out.println("The second parameter should be a natural number.");
                    }
                    if (availableProperties().contains(inputValuesList.get(0))) {
                        ArrayList<String> output = formatAll(input1, input2, inputValuesList);
                    } else{
                        System.out.println("The property [" + property.toUpperCase() + "] is wrong.");
                        System.out.println("Available properties " + printAvailableProperties() + "");
                    }
                } else if (inputArr.length == 2) {
                    ArrayList<String> inputValuesList = new ArrayList<>();
                    input1 = Long.parseLong(inputArr[0]);
                    input2 = Long.parseLong(inputArr[1]);
                    if (input1 < 0) {
                        System.out.println("first parameter should be a natural number");
                    } else if (input2 < 0) {
                        System.out.println("The second parameter should be a natural number.");
                    }
                    formatTwoNumbers(input1, input2);
                } else if (inputArr.length == 1) {
                    input1 = Long.parseLong(inputArr[0]);
                    if (input1 < 0) {
                        System.out.println("The first parameter should be a natural number or zero.");
                        continue;
                    }
                    System.out.println("Properties of " + format.format(Long.parseLong(inputArr[0])));
                    System.out.println("        buzz: " + isBuzz(Long.parseLong(inputArr[0])));
                    System.out.println("        duck: " + isDuck(Long.parseLong(inputArr[0])));
                    System.out.println(" palindromic: " + isPalindromic(Long.parseLong(inputArr[0])));
                    System.out.println("      gapful: " + isGapful(Long.parseLong(inputArr[0])));
                    System.out.println("         spy: " + isSpy(Long.parseLong(inputArr[0])));
                    System.out.println("       square: " + isSquare(Long.parseLong(inputArr[0])));
                    System.out.println("        sunny: " + isSunny(Long.parseLong(inputArr[0])));
                    System.out.println("      jumping: " + isJumping(Long.parseLong(inputArr[0])));
                    System.out.println("        happy: " + isHappy(Long.parseLong(inputArr[0])));
                    System.out.println("         sad: " + !isHappy(Long.parseLong(inputArr[0])));
                    System.out.println("        even: " + isEven(Long.parseLong(inputArr[0])));
                    System.out.println("         odd: " + isOdd(Long.parseLong(inputArr[0])));
                }
            } catch (NumberFormatException ignored) {
            }
        }

        System.out.println("\nGoodbye!");
    }

    public static void formatTwoNumbers(long first, long second) {
        ArrayList<Boolean> boolArr = new ArrayList<>();
        ArrayList<String> strArr = new ArrayList<>();
        NumberFormat format = NumberFormat.getInstance();


        for (long i = first; i < first + second; i++) {
            strArr = new ArrayList<>();
            boolean isBuzz = isBuzz(i);
            boolean isDuck = isDuck(i);
            boolean ispalindromic = isPalindromic(i);
            boolean isgapful = isGapful(i);
            boolean isSpy = isSpy(i);
            boolean isSquare  = isSquare(i);
            boolean isSunny = isSunny(i);
            boolean isHappy = isHappy(i);
            boolean isSad = !isHappy(i);
            boolean isJumping = isJumping(i);
            boolean isEven = isEven(i);
            boolean isOdd = isOdd(i);

            if (isBuzz) {
                strArr.add("buzz");
            }
            if (isDuck) {
                strArr.add("duck");
            }
            if (ispalindromic) {
                strArr.add("palindromic");
            }
            if (isgapful) {
                strArr.add("gapful");
            }
            if (isSpy) {
                strArr.add("spy");
            }
            if (isSquare) {
                strArr.add("square");
            }
            if (isSunny) {
                strArr.add("sunny");
            }
            if (isJumping) {
                strArr.add("jumping");
            }
            if (isHappy) {
                strArr.add("happy");
            }
            if (isSad) {
                strArr.add("sad");
            }
            if (isEven) {
                strArr.add("even");
            } else if (isOdd) {
                strArr.add("odd");
            }
            String formattedList = strArr.toString().replace("[", "").replace("]", "");
            System.out.println("             " + format.format(i) + " is " + formattedList);
        }
    }


    public static ArrayList<String> formatAll(long first, long second, ArrayList<String> properties) {
        ArrayList<Long> numberList = new ArrayList<>();
        NumberFormat format = NumberFormat.getInstance();
        ArrayList<String> strArr = new ArrayList<>();
        ArrayList<String> retArr = new ArrayList<>();
        int length = properties.size();
        if (length == 1) {
            numberList = printAll(first, second, properties.get(0));
        } else if (length == 2) {
            numberList = printAll(first, second,properties.get(0), properties.get(1));
        } else if (length == 3) {
            numberList = printAll(first, second,properties.get(0), properties.get(1), properties.get(2));
        } else if (length == 4) {
            numberList = printAll(first, second, properties.get(0), properties.get(1), properties.get(2), properties.get(3));
        } else if (length == 5) {
            numberList = printAll(first, second, properties.get(0), properties.get(1), properties.get(2), properties.get(3),
                    properties.get(4));
        } else if (length == 6) {
            numberList = printAll(first, second, properties.get(0), properties.get(1), properties.get(2), properties.get(3),
                    properties.get(4), properties.get(5));
        } else if (length == 7) {
            numberList = printAll(first, second, properties.get(0), properties.get(1), properties.get(2), properties.get(3),
                    properties.get(4), properties.get(5), properties.get(6));
        } else if (length == 8) {
            numberList = printAll(first, second, properties.get(0), properties.get(1), properties.get(2), properties.get(3),
                    properties.get(4), properties.get(5), properties.get(6), properties.get(7));
        } else if (length == 9) {
            numberList = printAll(first, second, properties.get(0), properties.get(1), properties.get(2), properties.get(3),
                    properties.get(4), properties.get(5), properties.get(6), properties.get(7),
                    properties.get(8));
        } else if (length == 10) {
            numberList = printAll(first, second, properties.get(0), properties.get(1), properties.get(2), properties.get(3),
                    properties.get(4), properties.get(5), properties.get(6), properties.get(7),
                    properties.get(8), properties.get(9));
        }
        for (int i = 0; i < numberList.size(); i++) {
            strArr = new ArrayList<>();
            boolean isBuzz = isBuzz(numberList.get(i));
            boolean isDuck = isDuck(numberList.get(i));
            boolean ispalindromic = isPalindromic(numberList.get(i));
            boolean isgapful = isGapful(numberList.get(i));
            boolean isSpy = isSpy(numberList.get(i));
            boolean isSquare = isSquare(numberList.get(i));
            boolean isSunny = isSunny(numberList.get(i));
            boolean isJumping = isJumping(numberList.get(i));
            boolean isHappy = isHappy(numberList.get(i));
            boolean isSad = !isHappy(numberList.get(i));
            boolean isEven = isEven(numberList.get(i));
            boolean isOdd = isOdd(numberList.get(i));

            if (isBuzz) {
                strArr.add("buzz");
            }
            if (isDuck) {
                strArr.add("duck");
            }
            if (ispalindromic) {
                strArr.add("palindromic");
            }
            if (isgapful) {
                strArr.add("gapful");
            }
            if (isSpy) {
                strArr.add("spy");
            }
            if (isSquare) {
                strArr.add("square");
            }
            if (isSunny) {
                strArr.add("sunny");
            }
            if (isJumping) {
                strArr.add("jumping");
            }
            if (isHappy) {
                strArr.add("happy");
            }
            if (isSad) {
                strArr.add("sad");
            }
            if (isEven) {
                strArr.add("even");
            }
            if (isOdd) {
                strArr.add("odd");
            }

            String formattedList = strArr.toString().replace("[", "").replace("]", "");
            if (numberList.get(i) < 1000) {
                retArr.add(format.format(numberList.get(i)) + " is " + formattedList);
                System.out.println("             " + format.format(numberList.get(i)) + " is " + formattedList);
            } else {
                retArr.add("           " + format.format(numberList.get(i)) + " is " + formattedList);
                System.out.println("           " + format.format(numberList.get(i)) + " is " + formattedList);
            }
        }
        return retArr;
    }

    public static ArrayList<Long> printAll(long first, long second, String... properties) {
        int length = properties.length;
        ArrayList<Long> numberList = new ArrayList<>();
        for (long i = first; numberList.size() != second; i++) {
            // 1 property
            if (length == 1) {
                if (mapToProperty(i, properties[0])) {
                    numberList.add(i);
                }
            } else if (length == 2) {
                if (mapToProperty(i, properties[0]) && mapToProperty(i, properties[1])) {
                    numberList.add(i);
                }
            } else if (length == 3) {
                if (mapToProperty(i, properties[0]) && mapToProperty(i, properties[1]) && mapToProperty(i, properties[2])) {
                    numberList.add(i);
                }
            } else if (length == 4) {
                if (mapToProperty(i, properties[0]) && mapToProperty(i, properties[1]) && mapToProperty(i, properties[2]) && mapToProperty(i, properties[3])) {
                    numberList.add(i);
                }
            } else if (length == 5) {
                if (mapToProperty(i, properties[0]) && mapToProperty(i, properties[1]) && mapToProperty(i, properties[2]) && mapToProperty(i, properties[3])
                        && mapToProperty(i, properties[4])) {
                    numberList.add(i);
                }
            } else if (length == 6) {
                if (mapToProperty(i, properties[0]) && mapToProperty(i, properties[1]) && mapToProperty(i, properties[2]) && mapToProperty(i, properties[3])
                        && mapToProperty(i, properties[4]) && mapToProperty(i, properties[5])) {
                    numberList.add(i);
                }
            }  else if (length == 7) {
                if (mapToProperty(i, properties[0]) && mapToProperty(i, properties[1]) && mapToProperty(i, properties[2]) && mapToProperty(i, properties[3])
                        && mapToProperty(i, properties[4]) && mapToProperty(i, properties[5]) && mapToProperty(i, properties[6])) {
                    numberList.add(i);
                }
            }  else if (length == 8) {
                if (mapToProperty(i, properties[0]) && mapToProperty(i, properties[1]) && mapToProperty(i, properties[2]) && mapToProperty(i, properties[3])
                        && mapToProperty(i, properties[4]) && mapToProperty(i, properties[5]) && mapToProperty(i, properties[6]) && mapToProperty(i, properties[7])) {
                    numberList.add(i);
                }
            }  else if (length == 9) {
                if (mapToProperty(i, properties[0]) && mapToProperty(i, properties[1]) && mapToProperty(i, properties[2]) && mapToProperty(i, properties[3])
                        && mapToProperty(i, properties[4]) && mapToProperty(i, properties[5]) && mapToProperty(i, properties[6]) && mapToProperty(i, properties[7])
                        && mapToProperty(i, properties[8])) {
                    numberList.add(i);
                }
            }   else if (length == 10) {
                if (mapToProperty(i, properties[0]) && mapToProperty(i, properties[1]) && mapToProperty(i, properties[2]) && mapToProperty(i, properties[3])
                        && mapToProperty(i, properties[4]) && mapToProperty(i, properties[5]) && mapToProperty(i, properties[6]) && mapToProperty(i, properties[7])
                        && mapToProperty(i, properties[8]) && mapToProperty(i, properties[9])) {
                    numberList.add(i);
                }
            }
        }
        return numberList;
    }

    public static boolean mapToProperty(long input, String property) {
        boolean output = false;
        switch (property) {
            case "buzz":
            case "BUZZ":
                output = isBuzz(input);
                break;
            case "duck":
            case "DUCK":
                output = isDuck(input);
                break;
            case "palindromic":
            case "PALINDROMIC":
                output = isPalindromic(input);
                break;
            case "gapful":
            case "GAPFUL":
                output = isGapful(input);
                break;
            case "spy":
            case "SPY":
                output = isSpy(input);
                break;
            case "square":
            case "SQUARE":
                output = isSquare(input);
                break;
            case "sunny":
            case "SUNNY":
                output = isSunny(input);
                break;
            case "jumping":
            case "JUMPING":
                output = isJumping(input);
                break;
            case "happy":
            case "HAPPY":
            case "-sad":
            case "-SAD":
                output = isHappy(input);
                break;
            case "even":
            case "EVEN":
                output = isEven(input);
                break;
            case "odd":
            case "ODD":
                output = isOdd(input);
                break;
            case "-buzz":
            case "-BUZZ":
                output = !isBuzz(input);
                break;
            case "-duck":
            case "-DUCK":
                output = !isDuck(input);
                break;
            case "-palindromic":
            case "-PALINDROMIC":
                output = !isPalindromic(input);
                break;
            case "-gapful":
            case "-GAPFUL":
                output = !isGapful(input);
                break;
            case "-square":
            case "-SQUARE":
                output = !isSquare(input);
                break;
            case "-sunny":
            case "-SUNNY":
                output = !isSunny(input);
                break;
            case "-spy":
            case "-SPY":
                output = !isSpy(input);
                break;
            case "-jumping":
            case "-JUMPING":
                output = !isJumping(input);
                break;
            case "-happy":
            case "-HAPPY":
            case "sad":
            case "SAD":
                output = !isHappy(input);
                break;
            case "-even":
            case "-EVEN":
                output = !isEven(input);
                break;
            case "-odd":
            case "-ODD":
                output = !isOdd(input);
                break;
        }
        return output;
    }

    private static boolean mutuallyExclusive(ArrayList<String> list) {
        boolean valid = true;
        if (list.contains("EVEN") && list.contains("ODD") || list.contains("even") && list.contains("odd")) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "EVEN", "ODD");
            valid = false;
        } else if ( list.contains("-even") && list.contains("-odd") || list.contains("-EVEN") && list.contains("-ODD"))  {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "-EVEN", "-ODD");
            valid = false;
        } else if ( list.contains("-even") && list.contains("even") || list.contains("-EVEN") && list.contains("EVEN")) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "-EVEN", "EVEN");
            valid = false;
        }  else if (list.contains("-ODD") && list.contains("ODD") || list.contains("-odd") && list.contains("odd")) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "-ODD", "ODD");
            valid = false;
        }   else if (list.contains("DUCK") && list.contains("SPY") || list.contains("duck") && list.contains("spy")) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "DUCK", "SPY");
            valid = false;
        } else if ( list.contains("-duck") && list.contains("-spy") || list.contains("-DUCK") && list.contains("-SPY"))  {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "-DUCK", "-SPY");
            valid = false;
        } else if ( list.contains("-duck") && list.contains("duck") || list.contains("-DUCK") && list.contains("DUCK")) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "-DUCK", "DUCK");
            valid = false;
        }  else if (list.contains("-spy") && list.contains("spy")|| list.contains("-SPY") && list.contains("SPY")) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "-SPY", "SPY");
            valid = false;
        } else if (list.contains("SUNNY") && list.contains("SQUARE") || list.contains("sunny") && list.contains("square")) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "SUNNY", "SQUARE");
            valid = false;
        } else if ( list.contains("-sunny") && list.contains("-square") || list.contains("-SUNNY") && list.contains("-SQUARE"))  {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "-SUNNY", "-SQUARE");
            valid = false;
        } else if ( list.contains("-sunny") && list.contains("sunny") || list.contains("-SUNNY") && list.contains("SUNNY")) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "-SUNNY", "SUNNY");
            valid = false;
        }  else if (list.contains("-square") && list.contains("square")|| list.contains("-SQUARE") && list.contains("SQUARE")) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "-SQUARE", "SQUARE");
            valid = false;
        } else if (list.contains("HAPPY") && list.contains("SAD") || list.contains("happy") && list.contains("sad")) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "HAPPY", "SAD");
            valid = false;
        } else if ( list.contains("-happy") && list.contains("-sad") || list.contains("-HAPPY") && list.contains("-SAD"))  {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "-HAPPY", "-SAD");
            valid = false;
        } else if ( list.contains("-happy") && list.contains("happy") || list.contains("-HAPPY") && list.contains("HAPPY")) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "-HAPPY", "HAPPY");
            valid = false;
        }  else if (list.contains("-sad") && list.contains("sad")|| list.contains("-SAD") && list.contains("SAD")) {
            System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n" +
                    "There are no numbers with these properties.\n", "-SAD", "SAD");
            valid = false;
        }
        return valid;
    }

    public static boolean isDuck(long input) {
        while (input > 0) {
            if (input % 10 == 0) {
                return true;
            }
            input = input / 10;
        }
        return false;
    }

    public static boolean isBuzz(long input) {
        boolean isBuzz = false;
        boolean endsWithSeven = input % 10 == 7;
        boolean divisibleBySeven = input % 7 == 0;

        if (endsWithSeven && divisibleBySeven) {
            isBuzz = true;
        } else if (endsWithSeven && !divisibleBySeven) {
            isBuzz = true;
        } else if (!endsWithSeven && divisibleBySeven) {
            isBuzz = true;
        } else {
            isBuzz = false;
        }
        return isBuzz;
    }

    public static String[] getInput() {
        String input = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a request: ");
        input = scan.nextLine();
        if (input.equals("")) {
            System.out.println("Welcome to Amazing Numbers!\n");
            System.out.println("Supported requests:");
            System.out.println("- enter a natural number to know its properties;");
            System.out.println("- enter two natural numbers to obtain the properties of the list:");
            System.out.println("  * the first parameter represents a starting number;");
            System.out.println("  * the second parameter shows how many consecutive numbers are to be processed;");
            System.out.println("- two natural numbers and properties to search for;");
            System.out.println("- a property preceded by minus must not be present in numbers;");
            System.out.println("- separate the parameters with one space;");
            System.out.println("- enter 0 to exit.\n");
        }
        String[] split = input.split(" ");
        return split;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public static boolean isValid(long input) {
        return input > 0;
    }


    public static boolean isEven(long input) {
        return input % 2 == 0;
    }

    public static boolean isOdd(long input) {
        return input % 2 == 1;
    }

    public static boolean isPalindromic(long input) {
        boolean palindrome = false;
        if (input > 0 && input < 10) {
            palindrome = true;
        }
        String inputStr = String.valueOf(input);
        String reverseStr = "";
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reverseStr += inputStr.charAt(i);
        }
        return inputStr.equals(reverseStr);
    }

    public static boolean isGapful(long input) {
        if (input >= 100) {
            String toStr = String.valueOf(input);
            long first = Integer.parseInt(String.valueOf(toStr.charAt(0)));
            long last = Integer.parseInt(String.valueOf(toStr.charAt(toStr.length() - 1)));
            String modStr = String.valueOf(first) + String.valueOf(last);
            long modInt = Integer.parseInt(modStr);
            return input % modInt == 0;
        }
        return false;
    }

    public static boolean isSpy(long input) {
        String toStr = String.valueOf(input);
        int sum = 0;
        int product = 1;

        for (int i = 0; i < toStr.length(); i++) {
            sum += Integer.parseInt(String.valueOf(toStr.charAt(i)));
            product = product * Integer.parseInt(String.valueOf(toStr.charAt(i)));
        }
        return sum == product;
    }

    public static boolean isSunny(long input) {
        long sunny = input + 1;
        long sqrt = (long) Math.sqrt(sunny);

        return (sqrt * sqrt) == sunny;
    }

    public static boolean isSquare(long input) {
        long sqrt = (long) Math.sqrt(input);
        return sqrt * sqrt == input;
    }

    public static boolean isJumping(long input) {
        boolean isJumping = false;
        String inputStr = String.valueOf(input);
        if (input < 10) {
            isJumping = true;
            return isJumping;
        }
        for (int i = 0; i < inputStr.length() - 1; i++) {
            if ((Math.abs((Long) Long.parseLong(String.valueOf(inputStr.charAt(i))) -
                    Long.parseLong(String.valueOf(inputStr.charAt(i + 1))))) == 1) {
                isJumping = true;
            } else {
                isJumping = false;
                break;
            }
        }
        return isJumping;
    }

    public static int numSquareSum(long n) {
        int squareSum = 0;
        while (n!= 0) {
            squareSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return squareSum;
    }

    public static boolean isHappy(long n) {
        long slow, fast;
        slow = fast = n;
        do {
            slow = numSquareSum(slow);
            fast = numSquareSum(numSquareSum(fast));
        }
        while (slow != fast);
        return (slow == 1);
    }
    public static void supportedRequests() {
        System.out.println("Welcome to Amazing Numbers!\n");
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("  * the first parameter represents a starting number;");
        System.out.println("  * the second parameter shows how many consecutive numbers are to be processed;");
        System.out.println("- two natural numbers and properties to search for;");
        System.out.println("- a property preceded by minus must not be present in numbers;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit.\n");
    }
    public static boolean isNatural(long input) {
        return input > 0;
    }

    public static ArrayList<String> availableProperties() {
        return new ArrayList<>(List.of(
                "EVEN", "ODD", "BUZZ", "DUCK", "PALINDROMIC", "GAPFUL", "SPY", "SQUARE", "SUNNY", "JUMPING", "HAPPY", "SAD",
                "-EVEN", "-ODD", "-BUZZ", "-DUCK", "-PALINDROMIC", "-GAPFUL", "-SPY", "-SQUARE", "-SUNNY", "-JUMPING", "-HAPPY", "-SAD", "buzz", "duck", "palindromic",
                "gapful", "spy", "square", "sunny", "jumping", "happy", "sad", "even", "odd", "-buzz", "-duck", "-palindromic",
                "-gapful", "-spy", "-square", "-sunny", "-jumping", "-happy", "-sad", "-even", "-odd"));
    }

    public static ArrayList<String> printAvailableProperties() {
        return new ArrayList<>(List.of(
                "BUZZ", "DUCK", "PALINDROMIC", "GAPFUL", "SPY", "SQUARE", "SUNNY", "JUMPING", "HAPPY", "SAD", "EVEN", "ODD"));
    }
}