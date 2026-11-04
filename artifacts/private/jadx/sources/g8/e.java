package g8;

import androidx.annotation.p0;
import java.util.Stack;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f275417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f275418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final e f275419d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, @p0 e eVar) {
        this.f275416a = str;
        this.f275417b = str2;
        this.f275418c = stackTraceElementArr;
        this.f275419d = eVar;
    }

    public static e a(Throwable th2, d dVar) {
        Stack stack = new Stack();
        while (th2 != null) {
            stack.push(th2);
            th2 = th2.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            eVar = new e(th3.getLocalizedMessage(), th3.getClass().getName(), dVar.a(th3.getStackTrace()), eVar);
        }
        return eVar;
    }
}
