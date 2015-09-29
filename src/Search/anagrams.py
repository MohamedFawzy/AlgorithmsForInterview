__author__ = 'Mohamed Fawzy'
def anagrams(dictonary):
    output = []
    map = {}
    # for each word in dictionary
    for word in dictonary:
        # sort the letters
        sorted_words = sortchars(word)
        # add the word to the list held in the dictionary
        # under its sorted key
        if sorted_words not in map:
            map[sorted_words] = [word]
        else:
            map[sorted_words].append(word)
    for k in map.keys():
        if len(map[k]) > 1:
            output.append(map[k])
    return output

def sortchars(words):
    l = list(words)
    l.sort()
    return ''.join(l)