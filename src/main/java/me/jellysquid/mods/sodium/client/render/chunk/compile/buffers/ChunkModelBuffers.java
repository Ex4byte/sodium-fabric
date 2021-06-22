package me.jellysquid.mods.sodium.client.render.chunk.compile.buffers;

import me.jellysquid.mods.sodium.client.model.PrimitiveSink;
import me.jellysquid.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import me.jellysquid.mods.sodium.client.render.chunk.data.ChunkRenderData;
import me.jellysquid.mods.sodium.client.render.chunk.format.ModelVertexSink;

public interface ChunkModelBuffers {
    PrimitiveSink<ModelVertexSink> getBuilder(ModelQuadFacing facing);

    @Deprecated
    ChunkRenderData.Builder getRenderData();
}
