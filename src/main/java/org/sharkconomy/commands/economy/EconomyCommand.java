package org.sharkconomy.commands.economy;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.sharkconomy.commands.economy.subcommands.*;


public class EconomyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use economy commands.");
            return false;
        }

        Player player = (Player) sender;

        if (args.length == 0) {
            player.sendMessage(ChatColor.RED + "Usage: /economy <subcommand>");
            return false;
        }

        switch (args[0].toLowerCase()) {
            case "balance":
                new Balance().execute(player, args);
                break;
            case "help":
                new Help().execute(player, args);
                break;
            case "pay":
                new Pay().execute(player, args);
                break;
            case "withdraw":
                new Withdraw().execute(player, args);
                break;
            case "deposit":
                new Deposit().execute(player, args);
                break;
            case "leaderboard":
                new Leaderboard().execute(player, args);
                break;
            case "sell":
                new Sell().execute(player, args);
                break;
            case "buy":
                new Buy().execute(player, args);
                break;
            case "transactions":
                new Transactions().execute(player, args);
                break;


            default:
                player.sendMessage(ChatColor.RED + "Unknown subcommand");
                break;
        }
        return true;
    }
}
