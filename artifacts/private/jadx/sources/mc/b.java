package mc;

import androidx.annotation.m1;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.protocol.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nFigmaClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FigmaClient.kt\ncom/planner5d/library/figma/FigmaClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f322895a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f322896b = "https://api.figma.com";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f322897c = "X-Figma-Token";

    private b() {
    }

    private final String b() throws IllegalStateException {
        String str = a.f322894d;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("No personal Figma token is provided");
    }

    @m1
    @NotNull
    public final String a(@NotNull String fileKey, @NotNull String nodeId) throws IllegalStateException, JSONException, IOException {
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://api.figma.com/v1/images/" + fileKey + "?ids=" + nodeId).openConnection());
        uRLConnection.setRequestProperty(f322897c, f322895a.b());
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            Intrinsics.checkNotNull(inputStream);
            byte[] bArrP = kotlin.io.b.p(inputStream);
            kotlin.io.c.a(inputStream, null);
            String string = new JSONObject(new String(bArrP, Charsets.UTF_8)).getJSONObject(d.b.f306176b).getString(nodeId);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(inputStream, th2);
                throw th3;
            }
        }
    }
}
