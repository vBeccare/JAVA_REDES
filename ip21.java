
import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

public class ip21 extends JPanel {

	public static double bithos(double h) {
		h = h + 2;
		h = Math.log(h) / Math.log(2);
		h = Math.ceil(h);
		return h;
	}

	private JLabel logo;
	ImageIcon logo1;

	// PAGINAAAAAAA INICIAAAAAAAL

	private JLabel perg1;
	private JFormattedTextField p1;
	private JButton bt1;

	// PAGINAAAAAAA INICIAAAAAAAL

	// PAGINAAAAAAA DOOOISSSS

	private JLabel dig, lh1, lh2, lh3, lh4, ip,lh5;
	private JFormattedTextField tfh1, tfh2, tfh3, tfh4,tfh5, tip;
	private JButton bt2;

	// PAGINAAAAAAA DOOOISSSS

	// PAGINAAAAAAA TREEEEESS

	private JLabel sub, range, broad, mascara;
	private JLabel ls1, ls2, ls3, ls4, ls5;
	private JLabel e1, e2, e3, e4, e5;
	private JLabel r1, r2, r3, r4, r5;
	private JLabel br1, br2, br3, br4, br5;
	private JLabel mas1, mas2, mas3, mas4, mas5;

	// PAGINAAAAAAA TREEEEESS

	public ip21() {
		inicializarComponentes();
		definirEventos();
	}

	public void inicializarComponentes() {
		setLayout(null);

		// PAGINAAAAAAA INICIAAAAAAAL

		perg1 = new JLabel("Seus hosts são diferentes?");
		perg1.setBounds(270, 150, 200, 20);
		p1 = new JFormattedTextField();
		p1.setBounds(290, 190, 100, 20);
		bt1 = new JButton("Continuar");
		bt1.setBounds(290, 240, 100, 20);
		add(perg1);
		add(p1);
		add(bt1);

		// PAGINAAAAAAA INICIAAAAAAAL

		// PAGINAAAAAAA DOOOISSSS

		dig = new JLabel("Digite os hosts que gostaria:");
		dig.setBounds(260, 150, 200, 20);
		lh1 = new JLabel("H1");
		lh1.setBounds(270, 175, 50, 30);
		lh2 = new JLabel("H2");
		lh2.setBounds(270, 205, 50, 30);
		lh3 = new JLabel("H3");
		lh3.setBounds(270, 235, 50, 30);
		lh4 = new JLabel("H4");
		lh4.setBounds(270, 265, 50, 30);
		lh5 = new JLabel("H5");
		lh5.setBounds(270, 295, 50, 30);
		tfh1 = new JFormattedTextField();
		tfh1.setBounds(290, 180, 100, 20);
		tfh2 = new JFormattedTextField();
		tfh2.setBounds(290, 210, 100, 20);
		tfh3 = new JFormattedTextField();
		tfh3.setBounds(290, 240, 100, 20);
		tfh4 = new JFormattedTextField();
		tfh4.setBounds(290, 270, 100, 20);
		tfh5 = new JFormattedTextField();
		tfh5.setBounds(290, 300, 100, 20);
		ip = new JLabel("IP");
		ip.setBounds(270, 340, 100, 20);
		tip = new JFormattedTextField();
		tip.setBounds(290, 340, 100, 20);
		bt2 = new JButton("Continuar");
		bt2.setBounds(290, 380, 100, 20);
		add(dig);
		add(lh1);
		add(lh2);
		add(lh3);
		add(lh4);
		add(lh5);
		add(tfh1);
		add(tfh2);
		add(tfh3);
		add(tfh4);
		add(tfh5);
		add(bt2);
		add(ip);
		add(tip);
		dig.setVisible(false);
		lh1.setVisible(false);
		lh2.setVisible(false);
		lh3.setVisible(false);
		lh4.setVisible(false);
		lh5.setVisible(false);
		tfh1.setVisible(false);
		tfh2.setVisible(false);
		tfh3.setVisible(false);
		tfh4.setVisible(false);
		tfh5.setVisible(false);
		bt2.setVisible(false);
		ip.setVisible(false);
		tip.setVisible(false);

		// PAGINAAAAAAA DOOOISSSS

		// PAGINAAAAAAA TREEEEESS

		sub = new JLabel("End.Subrede");
		sub.setBounds(120, 120, 150, 20);
		range = new JLabel("Range");
		range.setBounds(270, 120, 150, 20);
		broad = new JLabel("End.Broad");
		broad.setBounds(420, 120, 150, 20);
		mascara = new JLabel("Máscara");
		mascara.setBounds(570, 120, 150, 20);
		ls1 = new JLabel("Subrede1");
		ls1.setBounds(10, 150, 100, 20);
		ls2 = new JLabel("Subrede2");
		ls2.setBounds(10, 180, 100, 20);
		ls3 = new JLabel("Subrede3");
		ls3.setBounds(10, 210, 100, 20);
		ls4 = new JLabel("Subrede4");
		ls4.setBounds(10, 240, 100, 20);
		ls5 = new JLabel("Subrede5");
		ls5.setBounds(10, 270, 100, 20);
		e1 = new JLabel();
		e1.setBounds(120, 150, 100, 20);
		e2 = new JLabel();
		e2.setBounds(120, 180, 100, 20);
		e3 = new JLabel();
		e3.setBounds(120, 210, 100, 20);
		e4 = new JLabel();
		e4.setBounds(120, 240, 100, 20);
		e5 = new JLabel();
		e5.setBounds(120, 270, 100, 20);
		r1 = new JLabel();
		r1.setBounds(270, 150, 100, 20);
		r2 = new JLabel();
		r2.setBounds(270, 180, 100, 20);
		r3 = new JLabel();
		r3.setBounds(270, 210, 100, 20);
		r4 = new JLabel();
		r4.setBounds(270, 240, 100, 20);
		r5 = new JLabel();
		r5.setBounds(270, 270, 100, 20);
		br1 = new JLabel();
		br1.setBounds(420, 150, 100, 20);
		br2 = new JLabel();
		br2.setBounds(420, 180, 100, 20);
		br3 = new JLabel();
		br3.setBounds(420, 210, 100, 20);
		br4 = new JLabel();
		br4.setBounds(420, 240, 100, 20);
		br5 = new JLabel();
		br5.setBounds(420, 270, 100, 20);

		mas1 = new JLabel();
		mas1.setBounds(570, 150, 100, 20);
		mas2 = new JLabel();
		mas2.setBounds(570, 180, 100, 20);
		mas3 = new JLabel();
		mas3.setBounds(570, 210, 100, 20);
		mas4 = new JLabel();
		mas4.setBounds(570, 240, 100, 20);
		mas5 = new JLabel();
		mas5.setBounds(570, 270, 100, 20);
		sub.setVisible(false);
		range.setVisible(false);
		broad.setVisible(false);
		mascara.setVisible(false);
		ls1.setVisible(false);
		ls2.setVisible(false);
		ls3.setVisible(false);
		ls4.setVisible(false);
		ls5.setVisible(false);
		e1.setVisible(false);
		e2.setVisible(false);
		e3.setVisible(false);
		e4.setVisible(false);
		e5.setVisible(false);
		r1.setVisible(false);
		r2.setVisible(false);
		r3.setVisible(false);
		r4.setVisible(false);
		r5.setVisible(false);
		br1.setVisible(false);
		br2.setVisible(false);
		br3.setVisible(false);
		br4.setVisible(false);
		br5.setVisible(false);
		mas1.setVisible(false);
		mas2.setVisible(false);
		mas3.setVisible(false);
		mas4.setVisible(false);
		mas5.setVisible(false);
		add(sub);
		add(range);
		add(broad);
		add(mascara);
		add(ls1);
		add(ls2);
		add(ls3);
		add(ls4);
		add(ls5);
		add(e1);
		add(e2);
		add(e3);
		add(e4);
		add(e5);
		add(br1);
		add(br2);
		add(br3);
		add(br4);
		add(br5);
		add(mas1);
		add(mas2);
		add(mas3);
		add(mas4);
		add(mas5);
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(r5);
		// PAGINAAAAAAA TREEEEESS

		logo1 = new ImageIcon("F:\\interfacek\\img\\MAGLUV.png");
		logo = new JLabel(logo1);
		logo.setBounds(250, 25, 200, 80);
		add(logo);
	}

	public void definirEventos() {
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (p1.getText().equals("sim")) {
					dig.setVisible(true);
					lh1.setVisible(true);
					lh2.setVisible(true);
					lh3.setVisible(true);
					lh4.setVisible(true);
					lh5.setVisible(true);
					tfh1.setVisible(true);
					tfh2.setVisible(true);
					tfh3.setVisible(true);
					tfh4.setVisible(true);
					tfh5.setVisible(true);
					bt2.setVisible(true);
					ip.setVisible(true);
					tip.setVisible(true);
					perg1.setVisible(false);
					p1.setVisible(false);
					bt1.setVisible(false);
				} else {
					System.exit(0);
				}

			}
		});
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sub.setVisible(true);
				range.setVisible(true);
				broad.setVisible(true);
				mascara.setVisible(true);
				ls1.setVisible(true);
				ls2.setVisible(true);
				ls3.setVisible(true);
				ls4.setVisible(true);
				ls5.setVisible(true);
				e1.setVisible(true);
				e2.setVisible(true);
				e3.setVisible(true);
				e4.setVisible(true);
				e5.setVisible(true);
				r1.setVisible(true);
				r2.setVisible(true);
				r3.setVisible(true);
				r4.setVisible(true);
				r5.setVisible(true);
				br1.setVisible(true);
				br2.setVisible(true);
				br3.setVisible(true);
				br4.setVisible(true);
				br5.setVisible(true);
				mas1.setVisible(true);
				mas2.setVisible(true);
				mas3.setVisible(true);
				mas4.setVisible(true);
				mas5.setVisible(true);
				dig.setVisible(false);
				lh1.setVisible(false);
				lh2.setVisible(false);
				lh3.setVisible(false);
				lh4.setVisible(false);
				lh5.setVisible(false);
				tfh1.setVisible(false);
				tfh2.setVisible(false);
				tfh3.setVisible(false);
				tfh4.setVisible(false);
				tfh5.setVisible(false);
				ip.setVisible(false);
				tip.setVisible(false);
				bt2.setVisible(false);
				perg1.setVisible(false);
				p1.setVisible(false);
				bt1.setVisible(false);

				int k[] = new int[8];
				String[] ipAs = tip.getText().split("\\.");
				for (int i = 0; i < 4; i++) {
					k[i] = Integer.parseInt(ipAs[i]);
				}
				int h1 = Integer.parseInt(tfh1.getText());
				int h2 = Integer.parseInt(tfh2.getText());
				int h3 = Integer.parseInt(tfh3.getText());
				int h4 = Integer.parseInt(tfh4.getText());
				int h5= Integer.parseInt(tfh5.getText());
				double bh1 = bithos(h1);
				double bh5 = bithos(h5);
				int bih1 = (int) bh1;
				int bih5 = (int) bh5;

				int ranger = 0;
				int ranger2 = 0;
				int ranger3 = 0;
				int ranger4 = 0;
				int ranger5=0;
				int hos = 0;
				int fim = 1;
				int j[] = new int[8];
				String oi[] = new String[3];
				String oi2[] = new String[3];
				String oi3[] = new String[3];
				String oi4[] = new String[3];
				String oi5[] = new String[3];

				switch (bih1) {
				case 1:
					hos = 2;
					e1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + "0");
					mas1.setText("255.255.255.254");
					for (int y = 1; y < hos - 2; y++) {
						fim++;

					}

					oi = e1.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi[i]);
						ranger = Integer.parseInt(oi[3]);
						ranger = ranger + 1;

						r1.setText("." + ranger + " até " + "." + fim);

					}
					fim = fim + 1;
					br1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim);
					break;

				case 2:
					hos = 4;
					e1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + "0");
					mas1.setText("255.255.255.252");
					for (int y = 1; y < hos - 2; y++) {
						fim++;

					}

					oi = e1.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi[i]);
						ranger = Integer.parseInt(oi[3]);
						ranger = ranger + 1;

						r1.setText("." + ranger + " até " + "." + fim);

					}
					fim = fim + 1;
					br1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim);
					break;

				case 3:
					hos = 8;
					e1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + "0");
					mas1.setText("255.255.255.248");
					for (int y = 1; y < hos - 2; y++) {
						fim++;

					}

					oi = e1.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi[i]);
						ranger = Integer.parseInt(oi[3]);
						ranger = ranger + 1;
						r1.setText("." + ranger + " até " + "." + fim);

					}
					fim = fim + 1;
					br1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim);
					break;
				case 4:
					hos = 16;
					e1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + "0");
					mas1.setText("255.255.255.240");
					for (int y = 1; y < hos - 2; y++) {
						fim++;

					}

					oi = e1.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi[i]);
						ranger = Integer.parseInt(oi[3]);
						ranger = ranger + 1;

						r1.setText("." + ranger + " até " + "." + fim);

					}
					fim = fim + 1;
					br1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim);
					break;
				case 5:
					hos = 32;
					e1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + "0");
					mas1.setText("255.255.255.224");
					for (int y = 1; y < hos - 2; y++) {
						fim++;

					}

					oi = e1.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi[i]);
						ranger = Integer.parseInt(oi[3]);
						ranger = ranger + 1;

						r1.setText("." + ranger + " até " + "." + fim);

					}
					fim = fim + 1;
					br1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim);
					break;
				case 6:
					hos = 64;
					e1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + "0");
					mas1.setText("255.255.255.192");
					for (int y = 1; y < hos - 2; y++) {
						fim++;

					}

					oi = e1.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi[i]);
						ranger = Integer.parseInt(oi[3]);
						ranger = ranger + 1;

						r1.setText("." + ranger + " até " + "." + fim);

					}
					fim = fim + 1;
					br1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim);
					break;
				case 7:
					hos = 128;
					e1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + "0");
					mas1.setText("255.255.255.128");
					for (int y = 1; y < hos - 2; y++) {
						fim++;

					}

					oi = e1.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi[i]);
						ranger = Integer.parseInt(oi[3]);
						ranger = ranger + 1;

						r1.setText("." + ranger + " até " + "." + fim);

					}
					fim = fim + 1;
					br1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim);
					break;
				case 8:
					hos = 256;
					e1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + "0");
					mas1.setText("255.255.255.0");
					for (int y = 1; y < hos - 2; y++) {
						fim++;
					}

					oi = e1.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi[i]);
						ranger = Integer.parseInt(oi[3]);
						ranger = ranger + 1;
						r1.setText("." + ranger + "até" + "." + fim);

					}
					fim = fim + 1;
					br1.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim);
					break;

				default:
					JOptionPane.showMessageDialog(null, "Não existe");
					System.exit(0);
				}
				double bh2 = bithos(h2);
				double bh3 = bithos(h3);
				double bh4 = bithos(h4);

				int bih2 = (int) bh2;
				int bih3 = (int) bh3;
				int bih4 = (int) bh4;

				switch (bih2) {
				case 1:
					hos = 2;
					oi2 = br1.getText().split("\\.");
					ranger2 = Integer.parseInt(oi2[3]);
					ranger2 = ranger2 + 1;
					e2.setText(oi2[0] + "." + oi2[1] + "." + oi2[2] + "." + ranger2);
					int fim2 = ranger2;
					mas2.setText("255.255.255.254");

					for (int y = 1; y < hos - 2; y++) {
						fim2++;

					}

					oi2 = e2.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi2[i]);
						ranger2 = Integer.parseInt(oi2[3]);
						ranger2 = ranger2 + 1;

						r2.setText("." + ranger2 + " até " + "." + fim2);

					}
					fim2 = fim2 + 1;
					br2.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim2);
					break;

				case 2:
					hos = 4;
					oi2 = br1.getText().split("\\.");
					ranger2 = Integer.parseInt(oi2[3]);
					ranger2 = ranger2 + 1;
					e2.setText(oi2[0] + "." + oi2[1] + "." + oi2[2] + "." + ranger2);
					fim2 = ranger2 + 1;
					mas2.setText("255.255.255.252");
					for (int y = 1; y < hos - 2; y++) {
						fim2++;

					}

					oi2 = e2.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi2[i]);
						ranger2 = Integer.parseInt(oi2[3]);
						ranger2 = ranger2 + 1;

						r2.setText("." + ranger2 + " até " + "." + fim2);

					}
					fim2 = fim2 + 1;
					br2.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim2);
					break;

				case 3:
					hos = 8;
					oi2 = br1.getText().split("\\.");
					ranger2 = Integer.parseInt(oi2[3]);
					ranger2 = ranger2 + 1;
					e2.setText(oi2[0] + "." + oi2[1] + "." + oi2[2] + "." + ranger2);
					fim2 = ranger2 + 1;
					mas2.setText("255.255.255.248");
					for (int y = 1; y < hos - 2; y++) {
						fim2++;

					}

					oi2 = e2.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi2[i]);
						ranger2 = Integer.parseInt(oi2[3]);
						ranger2 = ranger2 + 1;

						r2.setText("." + ranger2 + " até " + "." + fim2);

					}
					fim2 = fim2 + 1;
					br2.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim2);
					break;
				case 4:
					hos = 16;
					oi2 = br1.getText().split("\\.");
					ranger2 = Integer.parseInt(oi2[3]);
					ranger2 = ranger2 + 1;
					e2.setText(oi2[0] + "." + oi2[1] + "." + oi2[2] + "." + ranger2);
					fim2 = ranger2 + 1;
					mas2.setText("255.255.255.240");
					for (int y = 1; y < hos - 2; y++) {
						fim2++;

					}

					oi2 = e2.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi2[i]);
						ranger2 = Integer.parseInt(oi2[3]);
						ranger2 = ranger2 + 1;

						r2.setText("." + ranger2 + " até " + "." + fim2);

					}
					fim2 = fim2 + 1;
					br2.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim2);
					break;
				case 5:
					hos = 32;
					oi2 = br1.getText().split("\\.");
					ranger2 = Integer.parseInt(oi2[3]);
					ranger2 = ranger2 + 1;
					e2.setText(oi2[0] + "." + oi2[1] + "." + oi2[2] + "." + ranger2);
					fim2 = ranger2 + 1;
					mas2.setText("255.255.255.224");
					for (int y = 1; y < hos - 2; y++) {
						fim2++;

					}

					oi2 = e2.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi2[i]);
						ranger2 = Integer.parseInt(oi2[3]);
						ranger2 = ranger2 + 1;

						r2.setText("." + ranger2 + " até " + "." + fim2);

					}
					fim2 = fim2 + 1;
					br2.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim2);
					break;
				case 6:
					hos = 64;
					oi2 = br1.getText().split("\\.");
					ranger2 = Integer.parseInt(oi2[3]);
					ranger2 = ranger2 + 1;
					e2.setText(oi2[0] + "." + oi2[1] + "." + oi2[2] + "." + ranger2);
					fim2 = ranger2 + 1;
					mas2.setText("255.255.255.192");
					for (int y = 1; y < hos - 2; y++) {
						fim2++;

					}

					oi2 = e2.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi2[i]);
						ranger2 = Integer.parseInt(oi2[3]);
						ranger2 = ranger2 + 1;

						r2.setText("." + ranger2 + " até " + "." + fim2);

					}
					fim2 = fim2 + 1;
					br2.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim2);
					break;
				case 7:
					hos = 128;
					oi2 = br1.getText().split("\\.");
					ranger2 = Integer.parseInt(oi2[3]);
					ranger2 = ranger2 + 1;
					e2.setText(oi2[0] + "." + oi2[1] + "." + oi2[2] + "." + ranger2);
					fim2 = ranger2 + 1;
					mas2.setText("255.255.255.128");
					for (int y = 1; y < hos - 2; y++) {
						fim2++;

					}

					oi2 = e2.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi2[i]);
						ranger2 = Integer.parseInt(oi2[3]);
						ranger2 = ranger2 + 1;

						r2.setText("." + ranger2 + " até " + "." + fim2);

					}
					fim2 = fim2 + 1;
					br2.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim2);
					break;
				case 8:
					hos = 256;
					oi2 = br1.getText().split("\\.");
					ranger2 = Integer.parseInt(oi2[3]);
					ranger2 = ranger2 + 1;
					e2.setText(oi2[0] + "." + oi2[1] + "." + oi2[2] + "." + ranger2);
					fim2 = ranger2 + 1;
					mas2.setText("255.255.255.0");
					for (int y = 1; y < hos - 2; y++) {
						fim2++;

					}

					oi2 = e2.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi2[i]);
						ranger2 = Integer.parseInt(oi2[3]);
						ranger2 = ranger2 + 1;

						r2.setText("." + ranger2 + " até " + "." + fim2);

					}
					fim2 = fim2 + 1;
					br2.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim2);
					break;

				default:
					JOptionPane.showMessageDialog(null, "Não existe");
					System.exit(0);
				}

				switch (bih3) {
				case 1:
					hos = 2;

					oi3 = br2.getText().split("\\.");
					ranger3 = Integer.parseInt(oi3[3]);
					ranger3 = ranger3 + 1;
					e3.setText(oi3[0] + "." + oi3[1] + "." + oi3[2] + "." + ranger3);
					int fim3 = ranger3 + 1;

					mas3.setText("255.255.255.254");

					for (int y = 1; y < hos - 2; y++) {
						fim3++;

					}

					oi3 = e3.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi3[i]);
						ranger3 = Integer.parseInt(oi3[3]);
						ranger3 = ranger3 + 1;

						r3.setText("." + ranger3 + " até " + "." + fim3);

					}
					fim3 = fim3 + 1;
					br3.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim3);

					break;

				case 2:
					hos = 4;

					oi3 = br2.getText().split("\\.");
					ranger3 = Integer.parseInt(oi3[3]);
					ranger3 = ranger3 + 1;
					e3.setText(oi3[0] + "." + oi3[1] + "." + oi3[2] + "." + ranger3);
					fim3 = ranger3 + 1;

					mas3.setText("255.255.255.252");

					for (int y = 1; y < hos - 2; y++) {
						fim3++;

					}

					oi3 = e3.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi3[i]);
						ranger3 = Integer.parseInt(oi3[3]);
						ranger3 = ranger3 + 1;

						r3.setText("." + ranger3 + " até " + "." + fim3);

					}
					fim3 = fim3 + 1;
					br3.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim3);

					break;

				case 3:
					hos = 8;

					oi3 = br2.getText().split("\\.");
					ranger3 = Integer.parseInt(oi3[3]);
					ranger3 = ranger3 + 1;
					e3.setText(oi3[0] + "." + oi3[1] + "." + oi3[2] + "." + ranger3);
					fim3 = ranger3 + 1;

					mas3.setText("255.255.255.248");

					for (int y = 1; y < hos - 2; y++) {
						fim3++;

					}

					oi3 = e3.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi3[i]);
						ranger3 = Integer.parseInt(oi3[3]);
						ranger3 = ranger3 + 1;

						r3.setText("." + ranger3 + " até " + "." + fim3);

					}
					fim3 = fim3 + 1;
					br3.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim3);

					break;
				case 4:
					hos = 16;

					oi3 = br2.getText().split("\\.");
					ranger3 = Integer.parseInt(oi3[3]);
					ranger3 = ranger3 + 1;
					e3.setText(oi3[0] + "." + oi3[1] + "." + oi3[2] + "." + ranger3);
					fim3 = ranger3 + 1;

					mas3.setText("255.255.255.240");

					for (int y = 1; y < hos - 2; y++) {
						fim3++;

					}

					oi3 = e3.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi3[i]);
						ranger3 = Integer.parseInt(oi3[3]);
						ranger3 = ranger3 + 1;

						r3.setText("." + ranger3 + " até " + "." + fim3);

					}
					fim3 = fim3 + 1;
					br3.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim3);

					break;
				case 5:
					hos = 32;

					oi3 = br2.getText().split("\\.");
					ranger3 = Integer.parseInt(oi3[3]);
					ranger3 = ranger3 + 1;
					e3.setText(oi3[0] + "." + oi3[1] + "." + oi3[2] + "." + ranger3);
					fim3 = ranger3 + 1;

					mas3.setText("255.255.255.224");

					for (int y = 1; y < hos - 2; y++) {
						fim3++;

					}

					oi3 = e3.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi3[i]);
						ranger3 = Integer.parseInt(oi3[3]);
						ranger3 = ranger3 + 1;

						r3.setText("." + ranger3 + " até " + "." + fim3);

					}
					fim3 = fim3 + 1;
					br3.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim3);

					break;
				case 6:
					hos = 64;

					oi3 = br2.getText().split("\\.");
					ranger3 = Integer.parseInt(oi3[3]);
					ranger3 = ranger3 + 1;
					e3.setText(oi3[0] + "." + oi3[1] + "." + oi3[2] + "." + ranger3);
					fim3 = ranger3 + 1;

					mas3.setText("255.255.255.192");

					for (int y = 1; y < hos - 2; y++) {
						fim3++;

					}

					oi3 = e3.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi3[i]);
						ranger3 = Integer.parseInt(oi3[3]);
						ranger3 = ranger3 + 1;

						r3.setText("." + ranger3 + " até " + "." + fim3);

					}
					fim3 = fim3 + 1;
					br3.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim3);

					break;
				case 7:
					hos = 128;

					oi3 = br2.getText().split("\\.");
					ranger3 = Integer.parseInt(oi3[3]);
					ranger3 = ranger3 + 1;
					e3.setText(oi3[0] + "." + oi3[1] + "." + oi3[2] + "." + ranger3);
					fim3 = ranger3 + 1;

					mas3.setText("255.255.255.128");

					for (int y = 1; y < hos - 2; y++) {
						fim3++;

					}

					oi3 = e3.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi3[i]);
						ranger3 = Integer.parseInt(oi3[3]);
						ranger3 = ranger3 + 1;

						r3.setText("." + ranger3 + " até " + "." + fim3);

					}
					fim3 = fim3 + 1;
					br3.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim3);

					break;
				case 8:
					hos = 256;

					oi3 = br2.getText().split("\\.");
					ranger3 = Integer.parseInt(oi3[3]);
					ranger3 = ranger3 + 1;
					e3.setText(oi3[0] + "." + oi3[1] + "." + oi3[2] + "." + ranger3);
					fim3 = ranger3 + 1;

					mas3.setText("255.255.255.0");

					for (int y = 1; y < hos - 2; y++) {
						fim3++;

					}

					oi3 = e3.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi3[i]);
						ranger3 = Integer.parseInt(oi3[3]);
						ranger3 = ranger3 + 1;

						r3.setText("." + ranger3 + " até " + "." + fim3);

					}
					fim3 = fim3 + 1;
					br3.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim3);

					break;

				default:
					JOptionPane.showMessageDialog(null, "Não existe");
					System.exit(0);
				}

				switch (bih4) {
				case 1:
					hos = 2;

					oi4 = br3.getText().split("\\.");
					ranger4 = Integer.parseInt(oi4[3]);
					ranger4 = ranger4 + 1;
					e4.setText(oi4[0] + "." + oi4[1] + "." + oi4[2] + "." + ranger4);
					int fim4 = ranger4 + 1;

					mas4.setText("255.255.255.254");

					for (int y = 1; y < hos - 2; y++) {
						fim4++;

					}

					oi4 = e4.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi4[i]);
						ranger4 = Integer.parseInt(oi4[3]);
						ranger4 = ranger4 + 1;

						r4.setText("." + ranger4 + " até " + "." + fim4);

					}
					fim4 = fim4 + 1;
					br4.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim4);

					break;

				case 2:
					hos = 4;

					oi4 = br3.getText().split("\\.");
					ranger4 = Integer.parseInt(oi4[3]);
					ranger4 = ranger4 + 1;
					e4.setText(oi4[0] + "." + oi4[1] + "." + oi4[2] + "." + ranger4);
					fim4 = ranger4 + 1;

					mas4.setText("255.255.255.252");
					for (int y = 1; y < hos - 2; y++) {
						fim4++;

					}

					oi4 = e4.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi4[i]);
						ranger4 = Integer.parseInt(oi4[3]);
						ranger4 = ranger4 + 1;

						r4.setText("." + ranger4 + " até " + "." + fim4);

					}
					fim4 = fim4 + 1;
					br4.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim4);
					break;

				case 3:
					hos = 8;

					oi4 = br3.getText().split("\\.");
					ranger4 = Integer.parseInt(oi4[3]);
					ranger4 = ranger4 + 1;
					e4.setText(oi4[0] + "." + oi4[1] + "." + oi4[2] + "." + ranger4);
					fim4 = ranger4 + 1;

					mas4.setText("255.255.255.248");
					for (int y = 1; y < hos - 2; y++) {
						fim4++;

					}

					oi4 = e4.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi4[i]);
						ranger4 = Integer.parseInt(oi4[3]);
						ranger4 = ranger4 + 1;

						r4.setText("." + ranger4 + " até " + "." + fim4);

					}
					fim4 = fim4 + 1;
					br4.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim4);
					break;
				case 4:
					hos = 16;

					oi4 = br3.getText().split("\\.");
					ranger4 = Integer.parseInt(oi4[3]);
					ranger4 = ranger4 + 1;
					e4.setText(oi4[0] + "." + oi4[1] + "." + oi4[2] + "." + ranger4);
					fim4 = ranger4 + 1;

					mas4.setText("255.255.255.240");
					for (int y = 1; y < hos - 2; y++) {
						fim4++;

					}

					oi4 = e4.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi4[i]);
						ranger4 = Integer.parseInt(oi4[3]);
						ranger4 = ranger4 + 1;

						r4.setText("." + ranger4 + " até " + "." + fim4);

					}
					fim4 = fim4 + 1;
					br4.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim4);
					break;
				case 5:
					hos = 32;

					oi4 = br3.getText().split("\\.");
					ranger4 = Integer.parseInt(oi4[3]);
					ranger4 = ranger4 + 1;
					e4.setText(oi4[0] + "." + oi4[1] + "." + oi4[2] + "." + ranger4);
					fim4 = ranger4 + 1;

					mas4.setText("255.255.255.224");
					for (int y = 1; y < hos - 2; y++) {
						fim4++;

					}

					oi4 = e4.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi4[i]);
						ranger4 = Integer.parseInt(oi4[3]);
						ranger4 = ranger4 + 1;

						r4.setText("." + ranger4 + " até " + "." + fim4);

					}
					fim4 = fim4 + 1;
					br4.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim4);
					break;
				case 6:
					hos = 64;

					oi4 = br3.getText().split("\\.");
					ranger4 = Integer.parseInt(oi4[3]);
					ranger4 = ranger4 + 1;
					e4.setText(oi4[0] + "." + oi4[1] + "." + oi4[2] + "." + ranger4);
					fim4 = ranger4 + 1;

					mas4.setText("255.255.255.192");
					for (int y = 1; y < hos - 2; y++) {
						fim4++;

					}

					oi4 = e4.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi4[i]);
						ranger4 = Integer.parseInt(oi4[3]);
						ranger4 = ranger4 + 1;

						r4.setText("." + ranger4 + " até " + "." + fim4);

					}
					fim4 = fim4 + 1;
					br4.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim4);
					break;
				case 7:
					hos = 128;

					oi4 = br3.getText().split("\\.");
					ranger4 = Integer.parseInt(oi4[3]);
					ranger4 = ranger4 + 1;
					e4.setText(oi4[0] + "." + oi4[1] + "." + oi4[2] + "." + ranger4);
					fim4 = ranger4 + 1;

					mas4.setText("255.255.255.128");
					for (int y = 1; y < hos - 2; y++) {
						fim4++;

					}

					oi4 = e4.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi4[i]);
						ranger4 = Integer.parseInt(oi4[3]);
						ranger4 = ranger4 + 1;

						r4.setText("." + ranger4 + " até " + "." + fim4);

					}
					fim4 = fim4 + 1;
					br4.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim4);
					break;
				case 8:
					hos = 256;

					oi4 = br3.getText().split("\\.");
					ranger4 = Integer.parseInt(oi4[3]);
					ranger4 = ranger4 + 1;
					e4.setText(oi4[0] + "." + oi4[1] + "." + oi4[2] + "." + ranger4);
					fim4 = ranger4 + 1;

					mas4.setText("255.255.255.0");
					for (int y = 1; y < hos - 2; y++) {
						fim4++;

					}

					oi4 = e4.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi4[i]);
						ranger4 = Integer.parseInt(oi4[3]);
						ranger4 = ranger4 + 1;

						r4.setText("." + ranger4 + " até " + "." + fim4);

					}
					fim4 = fim4 + 1;
					br4.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim4);
					break;

				default:
					JOptionPane.showMessageDialog(null, "Não existe");
					System.exit(0);
				}

				switch (bih5) {
				case 1:
					hos = 2;

					oi5 = br4.getText().split("\\.");
					ranger5 = Integer.parseInt(oi5[3]);
					ranger5 = ranger5 + 1;
					e5.setText(oi5[0] + "." + oi5[1] + "." + oi5[2] + "." + ranger5);
					int fim5 = ranger5 + 1;

					mas5.setText("255.255.255.254");

					for (int y = 1; y < hos - 2; y++) {
						fim5++;

					}

					oi5 = e5.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi5[i]);
						ranger5 = Integer.parseInt(oi5[3]);
						ranger5 = ranger5 + 1;

						r5.setText("." + ranger5 + " até " + "." + fim5);

					}
					fim5 = fim5 + 1;
					br5.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim5);

					break;

				case 2:
					hos = 4;

					oi5 = br4.getText().split("\\.");
					ranger5 = Integer.parseInt(oi5[3]);
					ranger5 = ranger5 + 1;
					e5.setText(oi5[0] + "." + oi5[1] + "." + oi5[2] + "." + ranger5);
					 fim5 = ranger5 + 1;


					mas5.setText("255.255.255.252");
					for (int y = 1; y < hos - 2; y++) {
						fim5++;

					}

					oi5 = e5.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi5[i]);
						ranger5 = Integer.parseInt(oi5[3]);
						ranger5 = ranger5 + 1;

						r5.setText("." + ranger5 + " até " + "." + fim5);

					}
					fim5 = fim5 + 1;
					br5.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim5);
					break;

				case 3:
					hos = 8;

					oi5 = br4.getText().split("\\.");
					ranger5 = Integer.parseInt(oi5[3]);
					ranger5 = ranger5 + 1;
					e5.setText(oi5[0] + "." + oi5[1] + "." + oi5[2] + "." + ranger5);
					 fim5 = ranger5 + 1;


					mas5.setText("255.255.255.248");
					for (int y = 1; y < hos - 2; y++) {
						fim5++;

					}

					oi5 = e5.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi5[i]);
						ranger5 = Integer.parseInt(oi5[3]);
						ranger5 = ranger5 + 1;

						r5.setText("." + ranger5 + " até " + "." + fim5);

					}
					fim5 = fim5 + 1;
					br5.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim5);
					break;
				case 4:
					hos = 16;

					oi5 = br4.getText().split("\\.");
					ranger5 = Integer.parseInt(oi5[3]);
					ranger5 = ranger5 + 1;
					e5.setText(oi5[0] + "." + oi5[1] + "." + oi5[2] + "." + ranger5);
					 fim5 = ranger5 + 1;


					mas5.setText("255.255.255.240");
					for (int y = 1; y < hos - 2; y++) {
						fim5++;

					}

					oi5 = e5.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi5[i]);
						ranger5 = Integer.parseInt(oi5[3]);
						ranger5 = ranger5 + 1;

						r5.setText("." + ranger5 + " até " + "." + fim5);

					}
					fim5 = fim5 + 1;
					br5.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim5);
					break;
				case 5:
					hos = 32;

					oi5 = br4.getText().split("\\.");
					ranger5 = Integer.parseInt(oi5[3]);
					ranger5 = ranger5 + 1;
					e5.setText(oi5[0] + "." + oi5[1] + "." + oi5[2] + "." + ranger5);
					 fim5 = ranger5 + 1;


					mas5.setText("255.255.255.224");
					for (int y = 1; y < hos - 2; y++) {
						fim5++;

					}

					oi5 = e5.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi5[i]);
						ranger5 = Integer.parseInt(oi5[3]);
						ranger5 = ranger5 + 1;

						r5.setText("." + ranger5 + " até " + "." + fim5);

					}
					fim5 = fim5 + 1;
					br5.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim5);
					break;
				case 6:
					hos = 64;

					oi5 = br4.getText().split("\\.");
					ranger5 = Integer.parseInt(oi5[3]);
					ranger5 = ranger5 + 1;
					e5.setText(oi5[0] + "." + oi5[1] + "." + oi5[2] + "." + ranger5);
					 fim5 = ranger5 + 1;


					mas5.setText("255.255.255.192");
					for (int y = 1; y < hos - 2; y++) {
						fim5++;

					}

					oi5 = e5.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi5[i]);
						ranger5 = Integer.parseInt(oi5[3]);
						ranger5 = ranger5 + 1;

						r5.setText("." + ranger5 + " até " + "." + fim5);

					}
					fim5 = fim5 + 1;
					br5.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim5);
					break;
				case 7:
					hos = 128;
					oi5 = br4.getText().split("\\.");
					ranger5 = Integer.parseInt(oi5[3]);
					ranger5 = ranger5 + 1;
					e5.setText(oi5[0] + "." + oi5[1] + "." + oi5[2] + "." + ranger5);
					 fim5 = ranger5 + 1;


					mas5.setText("255.255.255.128");
					for (int y = 1; y < hos - 2; y++) {
						fim5++;

					}

					oi5 = e5.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi5[i]);
						ranger5 = Integer.parseInt(oi5[3]);
						ranger5 = ranger5 + 1;

						r5.setText("." + ranger5 + " até " + "." + fim5);

					}
					fim5 = fim5 + 1;
					br5.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim5);
					break;
				case 8:
					hos = 256;

					oi5 = br4.getText().split("\\.");
					ranger5 = Integer.parseInt(oi5[3]);
					ranger5 = ranger5 + 1;
					e5.setText(oi5[0] + "." + oi5[1] + "." + oi5[2] + "." + ranger5);
					 fim5 = ranger5 + 1;

					mas5.setText("255.255.255.0");
					for (int y = 1; y < hos - 2; y++) {
						fim5++;

					}

					oi5 = e5.getText().split("\\.");
					for (int i = 0; i < 4; i++) {
						j[i] = Integer.parseInt(oi5[i]);
						ranger5 = Integer.parseInt(oi5[3]);
						ranger5 = ranger5 + 1;

						r5.setText("." + ranger5 + " até " + "." + fim5);

					}
					fim5 = fim5 + 1;
					br5.setText(ipAs[0] + "." + ipAs[1] + "." + ipAs[2] + "." + fim5);
					break;

				default:
					JOptionPane.showMessageDialog(null, "Não existe");
					System.exit(0);
				}
				
			}
		});
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("Calculadora de IP");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new ip21());
		frame.setBounds(300, 100, 700, 500);
		frame.setVisible(true);
	}

}
