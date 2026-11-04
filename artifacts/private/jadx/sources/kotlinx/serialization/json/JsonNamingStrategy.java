package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.apache.commons.codec.language.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlinx.serialization.g
public interface JsonNamingStrategy {

    @NotNull
    public static final Builtins Builtins = Builtins.$$INSTANCE;

    @SourceDebugExtension({"SMAP\nJsonNamingStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1179#2:179\n1180#2:181\n1#3:180\n*S KotlinDebug\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n*L\n149#1:179\n149#1:181\n*E\n"})
    @kotlinx.serialization.g
    public static final class Builtins {
        static final /* synthetic */ Builtins $$INSTANCE = new Builtins();

        @NotNull
        private static final JsonNamingStrategy SnakeCase = new JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$SnakeCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            public String serialNameForJson(SerialDescriptor descriptor, int i10, String serialName) {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(serialName, "serialName");
                return JsonNamingStrategy.Builtins.$$INSTANCE.convertCamelCase(serialName, '_');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        };

        @NotNull
        private static final JsonNamingStrategy KebabCase = new JsonNamingStrategy() { // from class: kotlinx.serialization.json.JsonNamingStrategy$Builtins$KebabCase$1
            @Override // kotlinx.serialization.json.JsonNamingStrategy
            public String serialNameForJson(SerialDescriptor descriptor, int i10, String serialName) {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(serialName, "serialName");
                return JsonNamingStrategy.Builtins.$$INSTANCE.convertCamelCase(serialName, l.f335457d);
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
            }
        };

        private Builtins() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String convertCamelCase(String str, char c10) {
            StringBuilder sb2 = new StringBuilder(str.length() * 2);
            Character chValueOf = null;
            int i10 = 0;
            for (int i11 = 0; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    if (i10 == 0 && sb2.length() > 0 && StringsKt.t7(sb2) != c10) {
                        sb2.append(c10);
                    }
                    if (chValueOf != null) {
                        sb2.append(chValueOf.charValue());
                    }
                    i10++;
                    chValueOf = Character.valueOf(Character.toLowerCase(cCharAt));
                } else {
                    if (chValueOf != null) {
                        if (i10 > 1 && Character.isLetter(cCharAt)) {
                            sb2.append(c10);
                        }
                        sb2.append(chValueOf.charValue());
                        chValueOf = null;
                        i10 = 0;
                    }
                    sb2.append(cCharAt);
                }
            }
            if (chValueOf != null) {
                sb2.append(chValueOf.charValue());
            }
            return sb2.toString();
        }

        @kotlinx.serialization.g
        public static /* synthetic */ void getKebabCase$annotations() {
        }

        @kotlinx.serialization.g
        public static /* synthetic */ void getSnakeCase$annotations() {
        }

        @NotNull
        public final JsonNamingStrategy getKebabCase() {
            return KebabCase;
        }

        @NotNull
        public final JsonNamingStrategy getSnakeCase() {
            return SnakeCase;
        }
    }

    @NotNull
    String serialNameForJson(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull String str);
}
