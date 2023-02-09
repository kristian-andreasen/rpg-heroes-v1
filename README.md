# RPG Heroes

### Description

### Tasks
- [ ] create a branch protecting rule that ensures that collaborators can't push directly to the master branch without submitting a PR first.
- [ ] create a Github Action that will help ensure that the code in pull requests passes all tests before being merged into the master branch.
- [ ] create UML class diagram

### Pull request guidelines
- When starting a new feature or bug fix, create a new branch from the master branch:
   ```sh
   git checkout -b my-feature master
   ```
- When working on a feature or fix, use short-lived branches as much as possible.
- When submitting a pull-request (PR), please try to limit the amount of code between 10-100 lines.
- Delete your local feature branch if you no longer need it:
   ```sh
   git branch -d my-feature
   ```
