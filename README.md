# LAB0: Papers, Please!
## Objective.
This lab is inspired by the game: Papers, Please.</br>
The primary task in the game is for the player to decide whether to grant or deny individuals entry into the city, based on their papers data.

The lab builds on the premise, but has some modified rules and background story, for a more light-hearted experience.

## Story background.

In a distant future, a software engineering intern has force pushed some untested code before the deadline to the multiverse codebase.

This mishap by the intern has caused the merging and colliding of our Moldavian Universe with a few fictional ones.

Even though the locals remained, individuals from the foreign universes have suddenly appeared. The foreigners even though curious about the Moldovian culture, want to get back to their own universes.

The issue is, they have no idea what the mutliverse is, and where do they belong.
## The solution

The Senior students of the Technical University of Moldova, being well-versed in pop-culture, recognize that the visitors can be sorted into four finctional universes.

A classification system is therefore agreed upon and documented in `classification.md`, the only thing remaining is to streamline the process of sending these travelers back to their correct universes.

Using the classification system, and an input file of all the registered individuals, the only thing left is to write an Object-Oriented system that does the automated classification.

### Inspirations for universes:

- Book - The Hitchhicker's guide to the galaxy

- Marvel Universe

- Star Wars Universe

- Lord of the Rings Universe

## Technical

`input.json` contains the list of the individuals. Some entries have full info, some partial. Using the Classification in `classification.md` write to 4 output files the grouped result per universe.

`output` folder is how your end solution should write the files.
# Daily Tasks #
## Day 1: Git & Base Class ##
- Initialize your workspace.
- Set up Git and GitHub for version control.
- Create a simple class and ensure it compiles successfully.
- Design the class around the main data of the laboratory.
- Experiment with the created class by printing, testing, and modifying it.</br>
  </br>Day 1 makes sure you have all the prerequisites to build a successful solution to the laboratory.
## Day 2: Reading from input.json ##
- Search how you can read a file into your program’s memory.
- Design a class that just reads the file, and prints it to the console. to interact with the file.
- Add to the class by parsing the file as a Json object, see what interfaces it exposes for you
- Print, test, modify aka play around with the class written, see if you can print each json object separately.
  </br></br>Day 2 is a practice with your programming language’s standard libraries, specifically reading files, and see how an external library (or internal if there’s a support for one) can work together with file reading by installing a json parser library.
## Day 3: Reading json into classes ##
- Start using and getting some practice with the debugger (optional, but recommended)
- Map the json to your internal class that was designed on day 1.
- Update the class structure depending on the results, and your future classification strategy.
- Create a container for the internal class representations.
- Print the classes out, print only some feature, for example just the ids, filter by even or odd id number, aka playaround with the result.
  </br></br>For day 3 see how can you take a json object and map it to your internal class. Create a list of resulting objects. Again play around with iteration and see what the Command Line prints.
## Day 4: Classification ##
- Design the classification solution.
- Really start using the debugger, and build a flow for classification.
- Learn to divide and conquer, start with two entries, see if your code does what is supposed to. Take more entries and see if the solution holds.
- Test, readjust, and test again.
  </br></br>For day 4 start working out a classification system, see if aligns with the classification mentioned in the Github repository. Play around with smaller inputs, and extend. </br>Here the real experimentation starts, the solution can be simple or complex, based on how you’ve initially designed the class. Some modifications could be made.
## Day 5: Output File & PR ##
- Review your solution.
- Create a View class for the output json files.
- Learn how you can encode your class back to json strings.
- Write to a file the output in the form mentioned in the github laboratory.
- Refactor as you please. Review, test, and...
- git push, create a pull request, submit the link to the PR on ELSE.
  </br></br>For day 5 the work is almost complete, the only thing left is to output the solution into a json file. This day can be a day where also time can be offered towards refactoring and review the code. Ask for advice and share solutions with other colleagues, see what they did good, and what can be improved.