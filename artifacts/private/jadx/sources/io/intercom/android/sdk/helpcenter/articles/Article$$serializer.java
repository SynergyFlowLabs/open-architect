package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.p0;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly")
@w0(parameters = 0)
public /* synthetic */ class Article$$serializer implements p0<Article> {
    public static final int $stable;

    @NotNull
    public static final Article$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Article$$serializer article$$serializer = new Article$$serializer();
        INSTANCE = article$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.intercom.android.sdk.helpcenter.articles.Article", article$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("related_conversation_id", true);
        pluginGeneratedSerialDescriptor.i("card", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Article$$serializer() {
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{hk.a.v(b3.f315897a), ArticleCard$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public final Article deserialize(@NotNull Decoder decoder) {
        String str;
        ArticleCard articleCard;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        v2 v2Var = null;
        if (dVarBeginStructure.c()) {
            str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, b3.f315897a, null);
            articleCard = (ArticleCard) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ArticleCard$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            str = null;
            ArticleCard articleCard2 = null;
            while (z10) {
                int iDecodeElementIndex = dVarBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, b3.f315897a, str);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new t0(iDecodeElementIndex);
                    }
                    articleCard2 = (ArticleCard) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ArticleCard$$serializer.INSTANCE, articleCard2);
                    i11 |= 2;
                }
            }
            articleCard = articleCard2;
            i10 = i11;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new Article(i10, str, articleCard, v2Var);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.d0
    public final void serialize(@NotNull Encoder encoder, @NotNull Article value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        kotlinx.serialization.encoding.e eVarBeginStructure = encoder.beginStructure(serialDescriptor);
        Article.write$Self$intercom_sdk_base_release(value, eVarBeginStructure, serialDescriptor);
        eVarBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.p0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return p0.a.a(this);
    }
}
