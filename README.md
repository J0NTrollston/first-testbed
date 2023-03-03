# first-testbed

## useful commands in git bash
### git clone <repo link>
clones the repo to your local machine
### git add .
add all new or updated changes when preparing for commits
### git commit -m "commit message"
commits and stages changes with a helpful message so that developers know what was changed
### git push origin <branch name>
pushes commit changes to the specified branch
### git pull origin <branch-name>
pulls updates/changes on specified branch from repo 
### git branch
shows current branch and all other branches
### git branch <new-branch-name>
creates new branch
### git checkout <other-branch-name>
moves you into a new existing branch
### git checkout -b <new-branch-name>
creates new branch and places you in it
### git status 
shows if you have any changes in current branch
##Careful
### git merge <branch name>
merges the specified branch into current branch user is in. This may inflict merge conflicts that 
will need to be resolved before push. 
Later, opening pull requests will be used to verify changes