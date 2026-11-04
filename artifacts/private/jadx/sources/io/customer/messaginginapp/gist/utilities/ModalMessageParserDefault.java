package io.customer.messaginginapp.gist.utilities;

import android.content.Intent;
import ih.b;
import ih.e;
import io.customer.messaginginapp.gist.data.model.Message;
import io.customer.messaginginapp.gist.data.model.MessagePosition;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ModalMessageParserDefault implements ModalMessageParser {

    @NotNull
    private final b dispatchersProvider;

    @NotNull
    private final e logger;

    @NotNull
    private final ModalMessageParser.JsonParser parser;

    /* JADX INFO: renamed from: io.customer.messaginginapp.gist.utilities.ModalMessageParserDefault$parseExtras$2, reason: invalid class name */
    @f(c = "io.customer.messaginginapp.gist.utilities.ModalMessageParserDefault$parseExtras$2", f = "ModalMessageParser.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super ModalMessageExtras>, Object> {
        final /* synthetic */ Intent $intent;
        final /* synthetic */ String $rawMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Intent intent, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$rawMessage = str;
            this.$intent = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ModalMessageParserDefault.this.new AnonymousClass2(this.$rawMessage, this.$intent, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MessagePosition messagePositionValueOf;
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                Message messageFromJson = ModalMessageParserDefault.this.parser.parseMessageFromJson(this.$rawMessage);
                if (messageFromJson == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String stringExtra = this.$intent.getStringExtra("GIST_MODAL_POSITION");
                if (stringExtra == null) {
                    messagePositionValueOf = messageFromJson.getGistProperties().getPosition();
                } else {
                    String upperCase = stringExtra.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    messagePositionValueOf = MessagePosition.valueOf(upperCase);
                }
                return new ModalMessageExtras(messageFromJson, messagePositionValueOf);
            } catch (Exception e10) {
                int i10 = 7 << 0;
                e.a.b(ModalMessageParserDefault.this.logger, "ModalMessageParser: Failed to parse modal message with error: " + e10.getMessage(), null, null, 6, null);
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super ModalMessageExtras> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public ModalMessageParserDefault(@NotNull e logger, @NotNull b dispatchersProvider, @NotNull ModalMessageParser.JsonParser parser) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.logger = logger;
        this.dispatchersProvider = dispatchersProvider;
        this.parser = parser;
    }

    @Override // io.customer.messaginginapp.gist.utilities.ModalMessageParser
    @Nullable
    public Object parseExtras(@NotNull Intent intent, @NotNull d<? super ModalMessageExtras> dVar) {
        String stringExtra = intent.getStringExtra("GIST_MESSAGE");
        if (stringExtra != null && stringExtra.length() != 0) {
            return i.h(this.dispatchersProvider.c(), new AnonymousClass2(stringExtra, intent, null), dVar);
        }
        e.a.b(this.logger, "ModalMessageParser: Message is null or empty", null, null, 6, null);
        return null;
    }
}
