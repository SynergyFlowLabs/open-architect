package androidx.datastore;

import android.content.Context;
import androidx.annotation.b0;
import androidx.datastore.core.j;
import androidx.datastore.core.l;
import androidx.datastore.core.m;
import io.sentry.protocol.z;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlin.reflect.o;
import kotlinx.coroutines.s0;
import okio.r0;
import okio.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class d<T> implements kotlin.properties.e<Context, l<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f49822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.datastore.core.okio.d<T> f49823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final v1.b<T> f49824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<Context, List<j<T>>> f49825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final s0 f49826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f49827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b0(z.b.f306551r)
    @Nullable
    private volatile l<T> f49828g;

    static final class a extends l0 implements Function0<r0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f49829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d<T> f49830b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, d<T> dVar) {
            super(0);
            this.f49829a = context;
            this.f49830b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final r0 invoke() {
            r0.a aVar = r0.f335070b;
            Context applicationContext = this.f49829a;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            String absolutePath = c.a(applicationContext, ((d) this.f49830b).f49822a).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "applicationContext.dataS…le(fileName).absolutePath");
            int i10 = 7 >> 0;
            return r0.a.h(aVar, absolutePath, false, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull String fileName, @NotNull androidx.datastore.core.okio.d<T> serializer, @Nullable v1.b<T> bVar, @NotNull Function1<? super Context, ? extends List<? extends j<T>>> produceMigrations, @NotNull s0 scope) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f49822a = fileName;
        this.f49823b = serializer;
        this.f49824c = bVar;
        this.f49825d = produceMigrations;
        this.f49826e = scope;
        this.f49827f = new Object();
    }

    @Override // kotlin.properties.e
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l<T> getValue(@NotNull Context thisRef, @NotNull o<?> property) {
        l<T> lVar;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        l<T> lVar2 = this.f49828g;
        if (lVar2 != null) {
            return lVar2;
        }
        synchronized (this.f49827f) {
            try {
                if (this.f49828g == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    m mVar = m.f49533a;
                    int i10 = 5 & 0;
                    androidx.datastore.core.okio.e eVar = new androidx.datastore.core.okio.e(v.f335116b, this.f49823b, null, new a(applicationContext, this), 4, null);
                    v1.b<T> bVar = this.f49824c;
                    Function1<Context, List<j<T>>> function1 = this.f49825d;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f49828g = mVar.h(eVar, bVar, function1.invoke(applicationContext), this.f49826e);
                }
                lVar = this.f49828g;
                Intrinsics.checkNotNull(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }
}
