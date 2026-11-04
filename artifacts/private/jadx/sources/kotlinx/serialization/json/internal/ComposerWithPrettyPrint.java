package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nComposers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composers.kt\nkotlinx/serialization/json/internal/ComposerWithPrettyPrint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
public final class ComposerWithPrettyPrint extends Composer {

    @NotNull
    private final Json json;
    private int level;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerWithPrettyPrint(@NotNull InternalJsonWriter writer, @NotNull Json json) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.json = json;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void indent() {
        setWritingFirst(true);
        this.level++;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void nextItem() {
        setWritingFirst(false);
        print("\n");
        int i10 = this.level;
        for (int i11 = 0; i11 < i10; i11++) {
            print(this.json.getConfiguration().getPrettyPrintIndent());
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void nextItemIfNotFirst() {
        if (getWritingFirst()) {
            setWritingFirst(false);
        } else {
            nextItem();
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void space() {
        print(' ');
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void unIndent() {
        this.level--;
    }
}
