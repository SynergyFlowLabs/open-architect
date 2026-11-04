package coil;

import android.content.Context;
import kotlin.b1;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCoil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Coil.kt\ncoil/Coil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f86931a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private static j f86932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static k f86933c;

    private b() {
    }

    @n
    @kotlin.l(level = kotlin.n.ERROR, message = "Replace with 'context.imageLoader.enqueue(request)'.", replaceWith = @b1(expression = "request.context.imageLoader.enqueue(request)", imports = {"coil.imageLoader"}))
    @NotNull
    public static final coil.request.e a(@NotNull coil.request.i iVar) {
        throw new IllegalStateException("Unsupported");
    }

    @n
    @kotlin.l(level = kotlin.n.ERROR, message = "Replace with 'context.imageLoader.execute(request)'.", replaceWith = @b1(expression = "request.context.imageLoader.execute(request)", imports = {"coil.imageLoader"}))
    @Nullable
    public static final Object b(@NotNull coil.request.i iVar, @NotNull kotlin.coroutines.d<? super coil.request.j> dVar) {
        throw new IllegalStateException("Unsupported");
    }

    @n
    @NotNull
    public static final j c(@NotNull Context context) {
        j jVar = f86932b;
        return jVar == null ? f86931a.d(context) : jVar;
    }

    private final synchronized j d(Context context) {
        j jVarA;
        try {
            j jVar = f86932b;
            if (jVar != null) {
                return jVar;
            }
            k kVar = f86933c;
            if (kVar == null || (jVarA = kVar.a()) == null) {
                Object applicationContext = context.getApplicationContext();
                k kVar2 = applicationContext instanceof k ? (k) applicationContext : null;
                jVarA = kVar2 != null ? kVar2.a() : l.a(context);
            }
            f86933c = null;
            f86932b = jVarA;
            return jVarA;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @n
    public static final synchronized void e() {
        try {
            f86932b = null;
            f86933c = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @n
    public static final synchronized void f(@NotNull j jVar) {
        try {
            f86933c = null;
            f86932b = jVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @n
    public static final synchronized void g(@NotNull k kVar) {
        try {
            f86933c = kVar;
            f86932b = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
