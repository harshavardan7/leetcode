const once = (fn) => {
    let isExecuted = false;
    return (...args) => (isExecuted ? undefined : ((isExecuted = true), fn(...args)));
};