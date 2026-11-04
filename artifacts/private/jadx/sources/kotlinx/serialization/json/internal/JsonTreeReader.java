package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.h;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nJsonTreeReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,121:1\n27#1,25:122\n27#1,25:147\n517#2,3:172\n*S KotlinDebug\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n*L\n19#1:122,25\n24#1:147,25\n64#1:172,3\n*E\n"})
public final class JsonTreeReader {
    private final boolean isLenient;

    @NotNull
    private final AbstractJsonLexer lexer;
    private int stackDepth;
    private final boolean trailingCommaAllowed;

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1, reason: invalid class name */
    @f(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends k implements n<j<Unit, JsonElement>, Unit, kotlin.coroutines.d<? super JsonElement>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                j jVar = (j) this.L$0;
                byte bPeekNextToken = JsonTreeReader.this.lexer.peekNextToken();
                if (bPeekNextToken == 1) {
                    return JsonTreeReader.this.readValue(true);
                }
                if (bPeekNextToken == 0) {
                    return JsonTreeReader.this.readValue(false);
                }
                if (bPeekNextToken != 6) {
                    if (bPeekNextToken == 8) {
                        return JsonTreeReader.this.readArray();
                    }
                    int i11 = 3 ^ 0;
                    AbstractJsonLexer.fail$default(JsonTreeReader.this.lexer, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new a0();
                }
                JsonTreeReader jsonTreeReader = JsonTreeReader.this;
                this.label = 1;
                obj = jsonTreeReader.readObject(jVar, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return (JsonElement) obj;
        }

        @Override // pj.n
        public final Object invoke(j<Unit, JsonElement> jVar, Unit unit, kotlin.coroutines.d<? super JsonElement> dVar) {
            AnonymousClass1 anonymousClass1 = JsonTreeReader.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = jVar;
            return anonymousClass1.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.JsonTreeReader$readObject$2, reason: invalid class name */
    @f(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", i = {0, 0, 0, 0}, l = {24}, m = "readObject", n = {"$this$readObject", "this_$iv", "result$iv", "key$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JsonTreeReader.this.readObject(null, this);
        }
    }

    public JsonTreeReader(@NotNull JsonConfiguration configuration, @NotNull AbstractJsonLexer lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.lexer = lexer;
        this.isLenient = configuration.isLenient();
        this.trailingCommaAllowed = configuration.getAllowTrailingComma();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonElement readArray() {
        byte bConsumeNextToken = this.lexer.consumeNextToken();
        if (this.lexer.peekNextToken() == 4) {
            AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new a0();
        }
        ArrayList arrayList = new ArrayList();
        while (this.lexer.canConsumeValue()) {
            arrayList.add(read());
            bConsumeNextToken = this.lexer.consumeNextToken();
            if (bConsumeNextToken != 4) {
                AbstractJsonLexer abstractJsonLexer = this.lexer;
                boolean z10 = bConsumeNextToken == 9;
                int i10 = abstractJsonLexer.currentPosition;
                if (!z10) {
                    AbstractJsonLexer.fail$default(abstractJsonLexer, "Expected end of the array or comma", i10, null, 4, null);
                    throw new a0();
                }
            }
        }
        if (bConsumeNextToken == 8) {
            this.lexer.consumeNextToken((byte) 9);
        } else if (bConsumeNextToken == 4) {
            if (!this.trailingCommaAllowed) {
                JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
                throw new a0();
            }
            this.lexer.consumeNextToken((byte) 9);
        }
        return new JsonArray(arrayList);
    }

    private final JsonElement readDeepRecursive() {
        return (JsonElement) i.b(new h(new AnonymousClass1(null)), Unit.f312394a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:25:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009e -> B:27:0x00ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object readObject(kotlin.j<kotlin.Unit, kotlinx.serialization.json.JsonElement> r19, kotlin.coroutines.d<? super kotlinx.serialization.json.JsonElement> r20) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.readObject(kotlin.j, kotlin.coroutines.d):java.lang.Object");
    }

    private final JsonObject readObjectImpl(Function0<? extends JsonElement> function0) {
        byte bConsumeNextToken = this.lexer.consumeNextToken((byte) 6);
        if (this.lexer.peekNextToken() == 4) {
            AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new a0();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (this.lexer.canConsumeValue()) {
            String strConsumeStringLenient = this.isLenient ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
            this.lexer.consumeNextToken((byte) 5);
            linkedHashMap.put(strConsumeStringLenient, function0.invoke());
            bConsumeNextToken = this.lexer.consumeNextToken();
            if (bConsumeNextToken != 4) {
                if (bConsumeNextToken == 7) {
                    break;
                }
                AbstractJsonLexer.fail$default(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
                throw new a0();
            }
        }
        if (bConsumeNextToken == 6) {
            this.lexer.consumeNextToken((byte) 7);
        } else if (bConsumeNextToken == 4) {
            if (!this.trailingCommaAllowed) {
                JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                throw new a0();
            }
            this.lexer.consumeNextToken((byte) 7);
        }
        return new JsonObject(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonPrimitive readValue(boolean z10) {
        String strConsumeStringLenient = (this.isLenient || !z10) ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
        return (z10 || !Intrinsics.areEqual(strConsumeStringLenient, AbstractJsonLexerKt.NULL)) ? new JsonLiteral(strConsumeStringLenient, z10, null, 4, null) : JsonNull.INSTANCE;
    }

    @NotNull
    public final JsonElement read() {
        byte bPeekNextToken = this.lexer.peekNextToken();
        if (bPeekNextToken == 1) {
            return readValue(true);
        }
        if (bPeekNextToken == 0) {
            return readValue(false);
        }
        if (bPeekNextToken == 6) {
            int i10 = this.stackDepth + 1;
            this.stackDepth = i10;
            JsonElement deepRecursive = i10 == 200 ? readDeepRecursive() : readObject();
            this.stackDepth--;
            return deepRecursive;
        }
        if (bPeekNextToken == 8) {
            return readArray();
        }
        boolean z10 = false;
        AbstractJsonLexer.fail$default(this.lexer, "Cannot read Json element because of unexpected " + AbstractJsonLexerKt.tokenDescription(bPeekNextToken), 0, null, 6, null);
        throw new a0();
    }

    private final JsonElement readObject() {
        byte bConsumeNextToken = this.lexer.consumeNextToken((byte) 6);
        if (this.lexer.peekNextToken() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (this.lexer.canConsumeValue()) {
                String strConsumeStringLenient = this.isLenient ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
                this.lexer.consumeNextToken((byte) 5);
                linkedHashMap.put(strConsumeStringLenient, read());
                bConsumeNextToken = this.lexer.consumeNextToken();
                if (bConsumeNextToken != 4) {
                    if (bConsumeNextToken == 7) {
                        break;
                    }
                    AbstractJsonLexer.fail$default(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
                    throw new a0();
                }
            }
            if (bConsumeNextToken == 6) {
                this.lexer.consumeNextToken((byte) 7);
            } else if (bConsumeNextToken == 4) {
                if (!this.trailingCommaAllowed) {
                    JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                    throw new a0();
                }
                this.lexer.consumeNextToken((byte) 7);
            }
            return new JsonObject(linkedHashMap);
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new a0();
    }
}
