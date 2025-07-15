/**
 * @param {string} word
 * @return {boolean}
 */
var isValid = function(word) {
    return word.length >=3 && /^[A-Za-z0-9]+$/.test(word)&&/[aeiou]/i.test(word)&& /[b-df-hj-np-tv-z]/i.test(word);
    };