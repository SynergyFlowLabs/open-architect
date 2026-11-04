package io.intercom.android.sdk.blocks;

import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class BlockFactory {
    private final TextSplittingStrategy textSplittingStrategy;

    public BlockFactory(TextSplittingStrategy textSplittingStrategy) {
        this.textSplittingStrategy = textSplittingStrategy;
    }

    public List<Block.Builder> getBlocksForText(String str) {
        List<String> listApply = this.textSplittingStrategy.apply(str);
        int size = listApply.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new Block.Builder().withType(BlockType.PARAGRAPH.name().toLowerCase()).withText(listApply.get(i10)));
        }
        return arrayList;
    }
}
