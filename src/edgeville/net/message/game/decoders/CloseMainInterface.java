package edgeville.net.message.game.decoders;

import edgeville.io.RSBuffer;
import edgeville.model.entity.Player;
import edgeville.net.message.game.encoders.Action;
import edgeville.net.message.game.encoders.PacketInfo;
import io.netty.channel.ChannelHandlerContext;

/**
 * @author Simon on sept 18 2015
 */
@PacketInfo(size = 0)
public class CloseMainInterface implements Action {

	@Override public void process(Player player) {
		player.interfaces().closeMain();
	}

	@Override public void decode(RSBuffer buf, ChannelHandlerContext ctx, int opcode, int size) { }

}
