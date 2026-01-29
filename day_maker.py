import os


print('Enter today\'s number:')
day = input()
print('Enter today\'s title:')
title = input()

folder = day + '-' + title

try:
    os.mkdir(folder)
    print(f'Folder "{folder}" created')
    fname = folder + "/description.txt"
    with open(fname,'w') as f_desc:
        print('Enter the problem link:')
        link = input()
        f_desc.write(link)
    fname = folder + "/Solution.Java"
    f_soln = open(fname,'x')
    
except FileExistsError:
    print(f'Folder "{folder}" already exists')
