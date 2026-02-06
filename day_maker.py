import os
import re


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
        # print('Enter the problem link:')
        # link = input()

        # title_lower = title.lower()
        # title_no_hyphens = title_lower.replace('-','')
        # title_arr = re.split(r'\s+',title_no_hyphens)
        # title_hyphens = '-'.join(title_arr)

        title_hyphens = '-'.join(
            re.split(r'\s+',
                title.lower().
                    replace('-','') ) )


        link = f'https://www.hackerrank.com/challenges/30-{title_hyphens}/problem'
        f_desc.write(link)
        print(f'Link assumed to be "{link}". Please double check this link')
    fname = folder + '/Solution.Java'
    f_soln = open(fname,'x')
    
except FileExistsError:
    print(f'Folder "{folder}" already exists')
