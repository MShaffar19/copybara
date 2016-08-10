import com.google.copybara.testing.DummyOriginalAuthor;
import com.google.copybara.testing.SkylarkTestExecutor;
import com.google.copybara.util.PathMatcherBuilder;
import java.nio.file.FileSystems;
  private String url;
  private String fetch;
  private String push;

  private SkylarkTestExecutor skylark;


    url = "file://" + repoGitDir;
    skylark = new SkylarkTestExecutor(options, Git.class);
  public void errorIfUrlMissing() throws ConfigValidationException {
    skylark.evalFails(
        "git.destination(\n"
        + "    fetch = 'master',\n"
        + "    push = 'master',\n"
        + ")",
        "missing mandatory positional argument 'url'");
  }

  @Test
  public void errorIfFetchMissing() throws ConfigValidationException {
    skylark.evalFails(
        "git.destination(\n"
            + "    url = 'file:///foo',\n"
            + "    push = 'master',\n"
            + ")",
        "missing mandatory positional argument 'fetch'");
  @Test
  public void errorIfPushMissing() throws ConfigValidationException {
    skylark.evalFails(
        "git.destination(\n"
            + "    url = 'file:///foo',\n"
            + "    fetch = 'master',\n"
            + ")",
        "missing mandatory positional argument 'push'");
  private GitDestination destinationFirstCommit()
    return evalDestination();
    return evalDestination();
  }

  private GitDestination evalDestination()
      throws ConfigValidationException {
    return skylark.eval("result",
        String.format("result = git.destination(\n"
            + "    url = '%s',\n"
            + "    fetch = '%s',\n"
            + "    push = '%s',\n"
            + ")", url, fetch, push));
    processWithBaselineAndConfirmation(destination, originRef, baseline,
        /*askForConfirmation*/false);
  }

  private void processWithBaselineAndConfirmation(GitDestination destination,
      DummyReference originRef,
      String baseline, boolean askForConfirmation)
      throws ConfigValidationException, RepoException, IOException {
    TransformResult result = TransformResults.of(workdir,
        originRef,
        PathMatcherBuilder.create(FileSystems.getDefault(), excludedDestinationPaths,
            ImmutableList.<String>of()));

    if (askForConfirmation) {
      result = result.withAskForConfirmation(true);
    }
    fetch = "testPullFromRef";
    push = "testPushToRef";
    fetch = "master";
    push = "master";
    processWithBaselineAndConfirmation(destinationFirstCommit(), new DummyReference("origin_ref"),
        /*baseline=*/null, /*askForConfirmation=*/true);
    fetch = "master";
    push = "master";
    processWithBaselineAndConfirmation(destinationFirstCommit(), new DummyReference("origin_ref"),
        /*baseline=*/null, /*askForConfirmation=*/true);
    fetch = "master";
    push = "master";
    fetch = "testPullFromRef";
    push = "testPushToRef";
    fetch = "pullFromBar";
    push = "pushToFoo";
    fetch = "master";
    push = "master";
    fetch = "master";
    push = "master";
    fetch = "master";
    push = "master";
    fetch = "master";
    push = "master";
    fetch = "master";
    push = "master";
    fetch = "master";
    push = "master";
    fetch = "master";
    push = "master";
    fetch = "master";
    push = "master";
    fetch = "master";
    push = "master";
        .withOriginalAuthor(new DummyOriginalAuthor("Foo Bar", "foo@bar.com"))
    fetch = "master";
    push = "master";
    fetch = "master";
    push = "master";
    fetch = "master";
    push = "master";
    fetch = "master";
    push = "master";
    fetch = "master";
    push = "master";
    fetch = "master";
    push = "refs_for_master";