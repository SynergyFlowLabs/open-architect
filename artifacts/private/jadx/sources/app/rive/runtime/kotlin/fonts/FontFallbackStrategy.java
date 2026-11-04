package app.rive.runtime.kotlin.fonts;

import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface FontFallbackStrategy {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @SourceDebugExtension({"SMAP\nFontFallbackStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFallbackStrategy.kt\napp/rive/runtime/kotlin/fonts/FontFallbackStrategy$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Nullable
        private static WeakReference<FontFallbackStrategy> stylePickerRef;

        private Companion() {
        }

        public final native void cppResetFontCache();

        @Nullable
        public final FontFallbackStrategy getStylePicker() {
            WeakReference<FontFallbackStrategy> weakReference = stylePickerRef;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @NotNull
        public final List<byte[]> pickFont(int i10) {
            FontFallbackStrategy stylePicker = getStylePicker();
            return stylePicker == null ? CollectionsKt.emptyList() : stylePicker.getFont(Fonts.Weight.Companion.fromInt(i10));
        }

        public final void setStylePicker(@Nullable FontFallbackStrategy fontFallbackStrategy) {
            if (getStylePicker() != fontFallbackStrategy) {
                stylePickerRef = fontFallbackStrategy != null ? new WeakReference<>(fontFallbackStrategy) : null;
                cppResetFontCache();
            }
        }
    }

    @NotNull
    List<byte[]> getFont(@NotNull Fonts.Weight weight);
}
