import com.google.copybara.Destination.WriterResult;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
    WriterResult destinationResult = destination.newWriter().write(result, console);
    assertThat(destinationResult).isEqualTo(WriterResult.OK);
    console.assertThat()
    WriterResult result = writer.write(TransformResults.of(workdir, new DummyReference("ref1")), console);
    assertThat(result).isEqualTo(WriterResult.OK);
    result = writer.write(TransformResults.of(workdir, new DummyReference("ref2")), console);
    assertThat(result).isEqualTo(WriterResult.OK);