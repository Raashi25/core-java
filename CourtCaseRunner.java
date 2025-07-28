import java.time.LocalDate;

class CourtCaseRunner {
    public static void main(String[] args) {

        System.out.println("Main Started - Court Case Information Display");

        CourtCase c1 = new CourtCase("OS/123/2023", "Civil - Property Dispute", "City Civil and Sessions Court, Bengaluru",
                "Mr. Raghavendra Rao", "Mrs. Lakshmi Devi", LocalDate.of(2023, 5, 10),
                LocalDate.of(2025, 7, 15), LocalDate.of(2025, 8, 20),
                "Arguments in progress", "Hon'ble Judge Shri. K. S. Murthy");

        CourtCase c2 = new CourtCase("MCD/45/2024", "Family - Divorce", "Family Court, Bengaluru",
                "Mrs. Anjali Sharma", "Mr. Vikram Sharma", LocalDate.of(2024, 1, 22),
                LocalDate.of(2025, 7, 1), LocalDate.of(2025, 9, 5),
                "Mediation recommended, awaiting report", "Hon'ble Judge Smt. P. L. Gowda");

        CourtCase c3 = new CourtCase("CC/789/2022", "Criminal - Theft", "Magistrate Court, Bengaluru North",
                "State of Karnataka", "Mr. Ravi Kumar", LocalDate.of(2022, 11, 1),
                LocalDate.of(2025, 7, 10), LocalDate.of(2025, 8, 12),
                "Cross-examination of prosecution witness", "Chief Judicial Magistrate Smt. D. N. Reddy");

        CourtCase c4 = new CourtCase("WP(PIL)/50/2024", "PIL - Environmental Protection", "High Court of Karnataka, Principal Bench, Bengaluru",
                "Citizens for Clean Air Trust", "State of Karnataka & BBMP", LocalDate.of(2024, 3, 15),
                LocalDate.of(2025, 7, 20), LocalDate.of(2025, 10, 1),
                "Notices issued, replies awaited", "Hon'ble Chief Justice & Division Bench");

        CourtCase c5 = new CourtCase("MACT/15/2023", "MACT - Compensation Claim", "MACT, Mysuru",
                "Mr. Suresh K.", "ABC Insurance Co. & Mr. Anil Reddy", LocalDate.of(2023, 7, 1),
                LocalDate.of(2025, 6, 25), LocalDate.of(2025, 8, 5),
                "Evidence led by claimant", "Member, MACT");

        CourtCase c6 = new CourtCase("CC/210/2023", "Consumer - Service Deficiency", "District Consumer Disputes Redressal Commission, Bengaluru Urban",
                "Mrs. Geetha Rao", "XYZ Electronics", LocalDate.of(2023, 9, 1),
                LocalDate.of(2025, 7, 8), null,
                "Disposed - Order for compensation issued", "President & Members");

        CourtCase c7 = new CourtCase("LAR/33/2022", "Civil - Land Acquisition", "Senior Civil Judge Court, Doddaballapur",
                "Mr. Shivaprakash B.", "Special Land Acquisition Officer", LocalDate.of(2022, 4, 1),
                LocalDate.of(2025, 6, 18), LocalDate.of(2025, 9, 10),
                "Valuation report submitted", "Senior Civil Judge Smt. A. M. Prasad");

        CourtCase c8 = new CourtCase("WP/112/2024", "Writ - Service Matter", "High Court of Karnataka, Kalaburagi Bench",
                "Mr. Raghavendra Prasad", "Karnataka Power Transmission Corporation Ltd.", LocalDate.of(2024, 6, 20),
                LocalDate.of(2025, 7, 2), LocalDate.of(2025, 9, 15),
                "Reply statement filed by respondent", "Hon'ble Justice Shri. B. S. Patil");

        CourtCase c9 = new CourtCase("CRL.A./40/2023", "Criminal - Appeal against Conviction", "Sessions Court, Mangaluru",
                "Mr. Deepak Rai (Appellant)", "State of Karnataka", LocalDate.of(2023, 10, 5),
                LocalDate.of(2025, 7, 1), LocalDate.of(2025, 8, 28),
                "Arguments scheduled", "Hon'ble Principal Sessions Judge");

        CourtCase c10 = new CourtCase("COMM.OS/5/2024", "Commercial - Contract Breach", "Commercial Court, Bengaluru",
                "Tech Solutions Pvt Ltd", "Global Enterprises", LocalDate.of(2024, 2, 1),
                LocalDate.of(2025, 7, 11), LocalDate.of(2025, 9, 25),
                "Document discovery in progress", "Hon'ble Commercial Court Judge");

        CourtCase c11 = new CourtCase("CRL.P./99/2025", "Criminal - Bail Application", "High Court of Karnataka, Dharwad Bench",
                "Mr. Kiran Gowda", "State by Police Inspector, Hubballi", LocalDate.of(2025, 6, 10),
                LocalDate.of(2025, 7, 18), LocalDate.of(2025, 7, 30),
                "Arguments partially heard", "Hon'ble Justice Shri. S. G. Hegde");

        CourtCase c12 = new CourtCase("FA/7/2025", "Consumer - Appeal against District Forum Order", "Karnataka State Consumer Disputes Redressal Commission",
                "XYZ Telecom (Appellant)", "Mr. Nagesh Bhat", LocalDate.of(2025, 3, 1),
                LocalDate.of(2025, 7, 9), LocalDate.of(2025, 9, 3),
                "Written arguments filed", "President & Members");

        CourtCase c13 = new CourtCase("ID/5/2024", "Labour - Unfair Termination", "Labour Court, Bengaluru",
                "Mr. Govindappa (Workman)", "Garment Factory Ltd.", LocalDate.of(2024, 7, 15),
                LocalDate.of(2025, 6, 20), LocalDate.of(2025, 8, 1),
                "Conciliation failed, matter referred for adjudication", "Presiding Officer, Labour Court");

        CourtCase c14 = new CourtCase("CCC/20/2025", "Contempt - Non-compliance of Order", "High Court of Karnataka, Bengaluru Bench",
                "High Court (Suo Motu)", "District Commissioner, Mandya", LocalDate.of(2025, 5, 2),
                LocalDate.of(2025, 7, 16), LocalDate.of(2025, 8, 22),
                "Explanation submitted, awaiting review", "Hon'ble Division Bench");

        CourtCase c15 = new CourtCase("EP/1/2024", "Election Petition - Disputed Election Result", "High Court of Karnataka, Bengaluru Bench",
                "Mr. Chandrappa (Candidate)", "Mr. Venkatesh & Election Commission of India", LocalDate.of(2024, 6, 1),
                LocalDate.of(2025, 7, 17), LocalDate.of(2025, 9, 8),
                "Witness examination ongoing", "Hon'ble Justice Shri. S. V. Narayan");

        CourtCase c16 = new CourtCase("WP/113/2024", "Writ - Retirement Dispute", "High Court of Karnataka, Kalaburagi Bench",
                "Mr. Somashekar", "PWD Department", LocalDate.of(2024, 8, 12),
                LocalDate.of(2025, 7, 19), LocalDate.of(2025, 9, 10),
                "Notice issued to respondents", "Hon'ble Justice Shri. D. R. Manjunath");

        CourtCase c17 = new CourtCase("OSA/77/2024", "Company Law - Oppression & Mismanagement", "NCLT Bengaluru Bench",
                "Minority Shareholders", "Board of ABC Ltd.", LocalDate.of(2024, 5, 4),
                LocalDate.of(2025, 7, 3), LocalDate.of(2025, 9, 6),
                "Arguments ongoing", "NCLT President");

        CourtCase c18 = new CourtCase("RC/11/2023", "Rent Control - Eviction Petition", "Rent Controller Court, Mysuru",
                "Landlord Mr. Vinay", "Tenant Mr. Shankar", LocalDate.of(2023, 3, 15),
                LocalDate.of(2025, 7, 7), LocalDate.of(2025, 8, 12),
                "Hearing fixed for cross", "Rent Controller");

        CourtCase c19 = new CourtCase("CP/34/2025", "Company Petition - Merger", "NCLT Bengaluru Bench",
                "Company A", "Company B", LocalDate.of(2025, 2, 5),
                LocalDate.of(2025, 7, 14), LocalDate.of(2025, 9, 30),
                "Scheme under consideration", "NCLT Judge");

        CourtCase c20 = new CourtCase("WP/90/2025", "Writ - Reservation Quota", "High Court of Karnataka, Bengaluru",
                "Student Union", "State Government", LocalDate.of(2025, 1, 20),
                LocalDate.of(2025, 7, 6), LocalDate.of(2025, 9, 1),
                "Replies filed, final hearing next", "Hon'ble Justice Shri. R. H. Nayak");

       
        c1.getCourtCaseInfo();  c2.getCourtCaseInfo();  c3.getCourtCaseInfo();  c4.getCourtCaseInfo();  c5.getCourtCaseInfo();
        c6.getCourtCaseInfo();  c7.getCourtCaseInfo();  c8.getCourtCaseInfo();  c9.getCourtCaseInfo();  c10.getCourtCaseInfo();
        c11.getCourtCaseInfo(); c12.getCourtCaseInfo(); c13.getCourtCaseInfo(); c14.getCourtCaseInfo(); c15.getCourtCaseInfo();
        c16.getCourtCaseInfo(); c17.getCourtCaseInfo(); c18.getCourtCaseInfo(); c19.getCourtCaseInfo(); c20.getCourtCaseInfo();

        System.out.println("Main Ended - Court Case Information Display Complete");
    }
}
