public class taxReturn {
    String filing;
    int income;
    public taxReturn(String status, int incomeAmount) {
        filing = status;
        income = incomeAmount;
    }

    public double getTax (String filing, int income) {
        double tax = 0;
        if (filing.equals("S")) {
            if (income < 9950) {
                System.out.println("No taxes!");
            } else if (income > 9950 && income < 40526) {
                tax  = 9950 * 0.10;
                tax += (income-9950) * 0.12;
                System.out.print("You need to pay: ");
            } else if (income >=40526 && income <=86375) {
                tax = 9950 * 0.10;
                tax += (40525-9951) * 0.12;
                tax += (income-40525) * 0.22;
                System.out.println("You need to pay: ");
            } else if (income >=86376 && income <=164925) {
                tax = 9950 * 0.10;
                tax += (40525-9951) * 0.12;
                tax += (86375-40526) * 0.22;
                tax += (income-86375) * 0.24;
                System.out.println("You need to pay: ");
            } else if (income >=164926 && income <=209425) {
                tax = 9950* 0.10;
                tax += (40525-9951) * 0.12;
                tax += (86375-40526) * 0.22;
                tax += (164925-86376) * 0.24;
                tax += (income-164926) * 0.32;
                System.out.println("You need to pay: ");
            } else if (income >=209426 && income <=523600) {
                tax = 9950* 0.10;
                tax += (40525-9951) * 0.12;
                tax += (86375-40525) * 0.22;
                tax += (164925-86375) * 0.24;
                tax += (209425-164926) * 0.32;
                tax += (income-209426) * 0.35;
                System.out.println("You need to pay: ");
            } else if (income >=523601) {
                tax = 9950* 0.10;
                tax += (40525-9951) * 0.12;
                tax += (86375-40526) * 0.22;
                tax += (164925-86376) * 0.24;
                tax += (209425-164926) * 0.32;
                tax += (523600-209426) * 0.35;
                tax += (income-523601) * 0.37;
                System.out.print("You need to pay: ");
            }
        } else if (filing.equals("MJ")) {
            if (income<19900) {
                tax = income * 0.10;
                System.out.println("You need to pay: ");
            } else if (income >= 19901 && income <= 81050) {
                tax  = 19901 * 0.10;
                tax += (income-19901) * 0.12;
                System.out.println("You need to pay: ");
            } else if (income >=81051 && income <=172750) {
                tax = 19901 * 0.10;
                tax += (81050-19901) * 0.12;
                tax += (income-172750) * 0.22;
                System.out.println("You need to pay: ");
            } else if (income >=172751 && income <=329850) {
                tax = 19901 * 0.10;
                tax += (81050-19901) * 0.12;
                tax += (172750-81051) * 0.22;
                tax += (income-172571) * 0.24;
                System.out.println("You need to pay: ");
            } else if (income >=329851 && income <=418850) {
                tax = 19901* 0.10;
                tax += (81050-19901) * 0.12;
                tax += (172750-81051) * 0.22;
                tax += (329850-172751) * 0.24;
                tax += (income-418850) * 0.32;
                System.out.println("You need to pay: ");
            } else if (income >=418851 && income <=628300) {
                tax = 19901* 0.10;
                tax += (81050-19901) * 0.12;
                tax += (172750-81051) * 0.22;
                tax += (329850-172751) * 0.24;
                tax += (418850-329851) * 0.32;
                tax += (income-628300) * 0.35;
                System.out.println("You need to pay: ");
            } else if (income >=628301) {
                tax = 19901* 0.10;
                tax += (81050-19901) * 0.12;
                tax += (172750-81051) * 0.22;
                tax += (329850-172751) * 0.24;
                tax += (418850-329851) * 0.32;
                tax += (628300-418851) * 0.35;
                tax += (income-628301) * 0.37;
                System.out.println("You need to pay: ");
            }
        } else if (filing.equals("MS")) {
            if (income<9550) {
                System.out.println("No taxes baby!");
            } else if (income >= 9951 && income <= 40525) {
                tax  = 9950 * 0.10;
                tax += (income-9950) * 0.12;
                System.out.println("You need to pay: ");
            } else if (income >=40526 && income <=86375) {
                tax = 9950 * 0.10;
                tax += (40525-9951) * 0.12;
                tax += (income-40526) * 0.22;
                System.out.println("You need to pay: ");
            }

            else if (income >=86376 && income <=164925) {
                tax = 9950 * 0.10;
                tax += (40525-9951) * 0.12;
                tax += (86375-40526) * 0.22;
                tax += (income-86375) * 0.24;
                System.out.println("You need to pay: ");
            }

            else if (income >=164926 && income <=209425) {
                tax = 9950* 0.10;
                tax += (40525-9951) * 0.12;
                tax += (86375-40526) * 0.22;
                tax += (164925-86375) * 0.24;
                tax += (income-209425) * 0.32;
                System.out.println("You need to pay: ");
            }

            else if (income >=209426 && income <=314150) {
                tax = 9950* 0.10;
                tax += (40525-9951) * 0.12;
                tax += (86375-40526) * 0.22;
                tax += (164925-86375) * 0.24;
                tax += (209425-164926) * 0.32;
                tax += (income-314150) * 0.35;
                System.out.println("You need to pay: ");
            }

            else if (income >=314151) {
                tax = 9950* 0.10;
                tax += (40525-9951) * 0.12;
                tax += (86375-40526) * 0.22;
                tax += (164925-86375) * 0.24;
                tax += (209425-164926) * 0.32;
                tax += (314150-209426) * 0.35;
                tax += (income-314151) * 0.37;
                System.out.println("You need to pay: ");
            }
        } else if (filing.equals("H")) {
            if (income<14200) {
                tax = income * 0.10;
                System.out.println("You need to pay: ");
            } else if (income >= 14201 && income <= 54200) {
                tax  = 14200 * 0.10;
                tax += (income-14201) * 0.12;
                System.out.println("You need to pay: ");
            } else if (income >=54201 && income <=86350) {
                tax = 14200 * 0.10;
                tax += (54200-14201) * 0.12;
                tax += (income-54201) * 0.22;
                System.out.println("You need to pay: ");
            } else if (income >=86351 && income <=164900) {
                tax = 14200 * 0.10;
                tax += (54200-14201) * 0.12;
                tax += (86350-54201) * 0.22;
                tax += (income-86351) * 0.24;
                System.out.println("You need to pay: ");
            } else if (income >=164901 && income <=209400) {
                tax = 14200 * 0.10;
                tax += (54200-14201) * 0.12;
                tax += (86350-54201) * 0.22;
                tax += (164900-86351) * 0.24;
                tax += (income-164901) * 0.32;
                System.out.println("You need to pay: ");
            } else if (income >=209401 && income <=523600) {
                tax = 14200 * 0.10;
                tax += (54200-14201) * 0.12;
                tax += (86350-54201) * 0.22;
                tax += (164900-86351) * 0.24;
                tax += (209400-164901) * 0.32;
                tax += (income-209401) * 0.35;
                System.out.println("You need to pay: ");
            } else if (income >=523601) {
                tax = 14200 * 0.10;
                tax += (54200-14201) * 0.12;
                tax += (86350-54201) * 0.22;
                tax += (164900-86351) * 0.24;
                tax += (209400-164901) * 0.32;
                tax += (523600-209401) * 0.35;
                tax += (income-523601) * 0.37;
                System.out.println("You need to pay: ");
            }
        }
        return tax;
    }
}