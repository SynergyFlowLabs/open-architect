package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class z1 extends n0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f315734b = new a(null);

    @kotlin.s
    public static final class a extends kotlin.coroutines.b<n0, z1> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z1 d(CoroutineContext.Element element) {
            if (element instanceof z1) {
                return (z1) element;
            }
            return null;
        }

        private a() {
            super(n0.f315180a, new Function1() { // from class: kotlinx.coroutines.y1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z1.a.d((CoroutineContext.Element) obj);
                }
            });
        }
    }

    @NotNull
    public abstract Executor M0();

    public abstract void close();
}
