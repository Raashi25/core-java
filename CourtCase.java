import java.time.LocalDate;

class CourtCase {
    String caseId;
    String caseType; 
    String courtName;
    String petitionerPlaintiff;
    String respondentDefendant;
    LocalDate filingDate;
    LocalDate lastHearingDate;
    LocalDate nextHearingDate;
    String currentStatus; 
    String presidingJudge; 

    // Constructor
    public CourtCase(String caseId, String caseType, String courtName, String petitionerPlaintiff,
                     String respondentDefendant, LocalDate filingDate, LocalDate lastHearingDate,
                     LocalDate nextHearingDate, String currentStatus, String presidingJudge) {
        this.caseId = caseId;
        this.caseType = caseType;
        this.courtName = courtName;
        this.petitionerPlaintiff = petitionerPlaintiff;
        this.respondentDefendant = respondentDefendant;
        this.filingDate = filingDate;
        this.lastHearingDate = lastHearingDate;
        this.nextHearingDate = nextHearingDate;
        this.currentStatus = currentStatus;
        this.presidingJudge = presidingJudge;
    }

    public void getCourtCaseInfo() {
        System.out.println("Case ID: " + caseId);
        System.out.println("Case Type: " + caseType);
        System.out.println("Court Name: " + courtName);
        System.out.println("Petitioner/Plaintiff: " + petitionerPlaintiff);
        System.out.println("Respondent/Defendant: " + respondentDefendant);
        System.out.println("Filing Date: " + filingDate);
        System.out.println("Last Hearing Date: " + lastHearingDate);
        System.out.println("Next Hearing Date: " + nextHearingDate);
        System.out.println("Current Status: " + currentStatus);
        System.out.println("Presiding Judge: " + presidingJudge);
        System.out.println();
    }
}
