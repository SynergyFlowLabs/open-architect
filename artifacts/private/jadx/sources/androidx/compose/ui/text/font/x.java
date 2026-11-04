package androidx.compose.ui.text.font;

import androidx.compose.runtime.o2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@o2
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f41764a = a.f41766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f41765b = 15000;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f41766a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f41767b = 15000;

        private a() {
        }
    }

    @kotlin.l(message = "Replaced with FontFamily.Resolver during the introduction of async fonts, all usages should be replaced. Custom subclasses can be converted into a FontFamily.Resolver by calling createFontFamilyResolver(myFontFamilyResolver, context)")
    public interface b {
        @kotlin.l(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.b1(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
        @NotNull
        Object a(@NotNull x xVar);
    }

    @NotNull
    v0 a();

    default int b() {
        return o0.f41676b.b();
    }

    int c();
}
