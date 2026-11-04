package androidx.datastore.preferences;

import android.content.Context;
import androidx.annotation.b0;
import androidx.datastore.core.j;
import androidx.datastore.core.l;
import io.sentry.protocol.z;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlin.reflect.o;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements kotlin.properties.e<Context, l<androidx.datastore.preferences.core.f>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f49852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final v1.b<androidx.datastore.preferences.core.f> f49853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<Context, List<j<androidx.datastore.preferences.core.f>>> f49854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final s0 f49855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f49856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0(z.b.f306551r)
    @Nullable
    private volatile l<androidx.datastore.preferences.core.f> f49857f;

    static final class a extends l0 implements Function0<File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f49858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f49859b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f49858a = context;
            this.f49859b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f49858a;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f49859b.f49852a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull String name, @Nullable v1.b<androidx.datastore.preferences.core.f> bVar, @NotNull Function1<? super Context, ? extends List<? extends j<androidx.datastore.preferences.core.f>>> produceMigrations, @NotNull s0 scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f49852a = name;
        this.f49853b = bVar;
        this.f49854c = produceMigrations;
        this.f49855d = scope;
        this.f49856e = new Object();
    }

    @Override // kotlin.properties.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l<androidx.datastore.preferences.core.f> getValue(@NotNull Context thisRef, @NotNull o<?> property) {
        l<androidx.datastore.preferences.core.f> lVar;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        l<androidx.datastore.preferences.core.f> lVar2 = this.f49857f;
        if (lVar2 != null) {
            return lVar2;
        }
        synchronized (this.f49856e) {
            try {
                if (this.f49857f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    androidx.datastore.preferences.core.e eVar = androidx.datastore.preferences.core.e.f49868a;
                    v1.b<androidx.datastore.preferences.core.f> bVar = this.f49853b;
                    Function1<Context, List<j<androidx.datastore.preferences.core.f>>> function1 = this.f49854c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f49857f = eVar.g(bVar, function1.invoke(applicationContext), this.f49855d, new a(applicationContext, this));
                }
                lVar = this.f49857f;
                Intrinsics.checkNotNull(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }
}
