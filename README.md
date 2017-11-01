# MidTerm class:

## 200 TOTAL Points: Create a MidTerm class and the following methods while using the following data:

```
1, 2, 3
```

1. 20 POINTS: create a `showIntData()` method.

2. 40 POINTS: create a `transformIntData()` method:

   add 1 to EACH data element and then multiply the resulting sum by 2 AND and show all data;

3. 80 POINTS: create a `listIteratorTransformIntData1()` method:

   Use ListIterator to transform (add 1 and multiply sum by 2) the original data and show the transformed data;

4. 60 POINTS: create a `listIteratorTransformIntData2()` method:

   Repeat use of ListIterator (transform data by adding 1 and multiplying sum by 2) but for the following data: 1.1, 2.1, 3.1

# MidTerm Life Program:

Use the supplied Abstract Classes for your API:

```
AbstractPerson
AbstractStudent
AbstractEmployee
AbstractLife
```

## Complete the implementation of the API in the following classes you write:

- Person derived from AbstractPerson
- Student derived from AbstractStudent
- Employee derived from AbstractEmployee
- LifeController derived from AbstractLife

You implementation must execute and successfully perform the following:

Parse CSV data (ID,FirstName,LastName,Age,GPA,Wage):

```
1,sam,jones,7,2.65,6.75,end
2,dan,smith,6,2.75,4.80,end
3,jim,adams,8,2.35,3.25,end
4,jan,lake,9,2.95,5.85,end
5,sam,jones,7,2.65,2.75,end
```

## 200 TOTAL Points: Person class:

1. 100 POINTS Instantiate Person objects from CSV data
2. 100 POINTS sort all persons by last name;

## 200 TOTAL Points: Student class:

1. 50 POINTS increase Person age by 10 years;.
2. 50 POINTS Derive Student class from AbstractStudent;
3. 50 POINTS Initialize Student from an already aged Person;
4. 50 POINTS up scale GPA by 1 (add 1 to each GPA) and show a list of each Student, sorted by GPA;

## 200 TOTAL Points: Employee class:

1. 50 POINTS increase Person age by 10 years.
2. 50 POINTS Derive Employee class from AbstractEmployee;
3. 50 POINTS Initialize Employee from an already aged Student;
4. 50 POINTS raise all wages by $10 and show a list of each Employee, sorted by wage;
