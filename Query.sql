SELECT section, COUNT(enrolment_No.) AS No. of Candidate greater
than or equal to 75 marks FROM student_marks
GROUP BY section
