package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public abstract class m2 {

    @NotNull
    private final b2 database;

    @NotNull
    private final AtomicBoolean lock;

    @NotNull
    private final kotlin.f0 stmt$delegate;

    static final class a extends kotlin.jvm.internal.l0 implements Function0<w3.i> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final w3.i invoke() {
            return m2.this.a();
        }
    }

    public m2(@NotNull b2 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = kotlin.g0.c(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w3.i a() {
        return this.database.compileStatement(createQuery());
    }

    private final w3.i b() {
        return (w3.i) this.stmt$delegate.getValue();
    }

    private final w3.i c(boolean z10) {
        return z10 ? b() : a();
    }

    @NotNull
    public w3.i acquire() {
        assertNotMainThread();
        return c(this.lock.compareAndSet(false, true));
    }

    protected void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    @NotNull
    protected abstract String createQuery();

    public void release(@NotNull w3.i statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == b()) {
            this.lock.set(false);
        }
    }
}
