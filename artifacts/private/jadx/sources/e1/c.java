package e1;

import androidx.compose.runtime.internal.w0;
import d1.h;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.i1;
import kotlin.sequences.Sequence;
import kotlin.sequences.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
public class c implements h<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f274606b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f274607a;

    public c(int i10) {
        this.f274607a = i10;
    }

    private final String c(int i10) {
        final i1.f fVar = new i1.f();
        final int size = d.f274608a.size();
        return o.e1(o.Y2(o.m(new Function0() { // from class: e1.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.d(fVar, size);
            }
        }), i10), " ", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(i1.f fVar, int i10) {
        List list = d.f274608a;
        int i11 = fVar.f312749a;
        fVar.f312749a = i11 + 1;
        return (String) list.get(i11 % i10);
    }

    @Override // d1.h
    @NotNull
    public Sequence<String> O1() {
        return o.q(c(this.f274607a));
    }

    public c() {
        this(500);
    }
}
