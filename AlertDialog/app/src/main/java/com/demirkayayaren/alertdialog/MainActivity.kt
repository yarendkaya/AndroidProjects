package com.demirkayayaren.alertdialog

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.demirkayayaren.alertdialog.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val addContactDialog = AlertDialog.Builder(this).setTitle("Add Contact")
            .setMessage("Do you want to add Mr.Poop to your contacts list?")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "You added Mr.Poop to your contact list", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(
                    this,
                    "You didn't add Mr.Poop to your contact list",
                    Toast.LENGTH_SHORT
                )
                    .show()
            }.create()


        binding.btnDialog1.setOnClickListener {
            addContactDialog.show()
        }

        val options = arrayOf("First item", "Second item", "Third item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setSingleChoiceItems(options, 0) { dialogInterface, i ->
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You accepted the SingleChoiceDialog", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this, "You declined the SingleChoiceDialog", Toast.LENGTH_SHORT)
                    .show()
            }

        binding.btnDialog2.setOnClickListener {
            singleChoiceDialog.show()
        }


        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setMultiChoiceItems(options, booleanArrayOf(false, false, false)) { _, i, isChecked ->
                if (isChecked) {
                    Toast.makeText(this, "You checked ${options[i]}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "You unchecked ${options[i]}", Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You accepted the MultiChoiceDialog", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this, "You declined the MultiChoiceDialog", Toast.LENGTH_SHORT)
                    .show()
            }.create()

        binding.btnDialog3.setOnClickListener {
            multiChoiceDialog.show()
        }
    }
}