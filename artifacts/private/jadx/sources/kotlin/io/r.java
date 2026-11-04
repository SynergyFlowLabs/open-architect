package kotlin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class r implements Sequence<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final BufferedReader f312702a;

    public static final class a implements Iterator<String>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f312703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f312704b;

        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f312703a;
            this.f312703a = null;
            Intrinsics.checkNotNull(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f312703a == null && !this.f312704b) {
                String line = r.this.f312702a.readLine();
                this.f312703a = line;
                if (line == null) {
                    this.f312704b = true;
                }
            }
            return this.f312703a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public r(@NotNull BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f312702a = reader;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<String> iterator() {
        return new a();
    }
}
