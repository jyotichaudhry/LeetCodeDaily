class BrowserHistory {

    List<String> history = new ArrayList<>();
    int currIdx;
    public BrowserHistory(String homepage) {
        history.add(homepage);
        currIdx = 0;
    }

    public void visit(String url) {
        while (history.size() > currIdx+1){
            history.removeLast();
        }
     history.add(url);
        currIdx += 1;
    }

    public String back(int steps) {
        currIdx = currIdx-steps > 0 ? currIdx-steps : 0;
        return  history.get(currIdx);

    }

    public String forward(int steps) {
        currIdx = currIdx+steps >= history.size()? history.size()-1 :currIdx+steps;
        return  history.get(currIdx);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */