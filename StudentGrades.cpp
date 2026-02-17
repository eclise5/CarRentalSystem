#include <iostream>
#include <string>
using namespace std;

class Person {
    protected:
        string name;
        string id;
    public:
        Person(string name, string id){
            this->name = name;
            this->id = id;
        }
    
    // Getters and Setters
    string getName() {
        return name;
    }
    string getId() {
        return id;
    }

    void setName(string name) {
        this->name = name;
    }
    void setId(string id) {
        this->id = id;
    }

    virtual void displayInfo()=0; // Pure virtual function
};

class Course {
    private:
        string courseName;
        string courseCode;
    public:
        Course(string courseName, string courseCode) {
            this->courseName = courseName;
            this->courseCode = courseCode;
        }

    // Getters
    string getCourseName() {
        return courseName;
    }
    string getCourseCode() {
        return courseCode;
    }
};

class Student : public Person {
    private:
        string course;
        double marks;
    public:
        Student(string name, string id, string course, double marks) : Person(name, id) {
            this->course = course;
            this->marks = marks;
        }

    // Getters and Setters
    double getMarks() {
        return marks;
    }

    void setMarks(double marks) {
        this->marks = marks;
    }

    string calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    //polymorphism using virtual function- method overriding
    void displayInfo() override {
        cout << "Student Name: " << name << endl;
        cout << "Student ID: " << id << endl;
        cout << "Course: " << course << endl;
        cout << "Marks: " << marks << endl;
        cout << "Grade: " << calculateGrade() << endl;
    }
};

int main(){
    Student student1("Alice", "S123", "Computer Science", 85);
    student1.displayInfo();
    

    return 0;
}