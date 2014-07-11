package org.kohsuke.github;

/**
 * Created with IntelliJ IDEA.
 * User: ayash
 * Date: 2/24/14
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class GHPullRequestMergeResponse {

    private String sha;
    private boolean merged;
    private String message;

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public boolean isMerged() {
        return merged;
    }

    public void setMerged(boolean merged) {
        this.merged = merged;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
