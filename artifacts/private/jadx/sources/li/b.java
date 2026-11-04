package li;

import androidx.core.app.w;
import io.ktor.utils.io.o0;
import java.util.Iterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nServerSentEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerSentEvent.kt\nio/ktor/sse/ServerSentEventKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n1869#2,2:114\n*S KotlinDebug\n*F\n+ 1 ServerSentEvent.kt\nio/ktor/sse/ServerSentEventKt\n*L\n96#1:114,2\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f322687a = ":";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f322688b = " ";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f322689c = "\r\n";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Regex f322690d = new Regex("\r\n|\r|\n");

    private static final <T> void b(StringBuilder sb2, String str, T t10) {
        if (t10 != null) {
            Iterator<T> it = f322690d.o(t10.toString(), 0).iterator();
            while (it.hasNext()) {
                sb2.append(str + ": " + ((String) it.next()) + "\r\n");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(String str, String str2, String str3, Long l10, String str4) {
        StringBuilder sb2 = new StringBuilder();
        b(sb2, "data", str);
        b(sb2, w.I0, str2);
        b(sb2, "id", str3);
        b(sb2, "retry", l10);
        b(sb2, "", str4);
        return sb2.toString();
    }

    @o0
    public static /* synthetic */ void d() {
    }

    @o0
    public static /* synthetic */ void e() {
    }

    @NotNull
    public static final Regex f() {
        return f322690d;
    }

    @o0
    public static /* synthetic */ void g() {
    }

    @o0
    public static /* synthetic */ void h() {
    }
}
